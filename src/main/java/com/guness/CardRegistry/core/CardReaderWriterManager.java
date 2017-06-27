package com.guness.CardRegistry.core;

import com.guness.CardRegistry.model.CardModel;
import com.guness.CardRegistry.util.ReadWriteUtils;
import com.guness.CardRegistry.util.TerminalUtils;
import javafx.application.Platform;
import org.nfctools.NfcAdapter;
import org.nfctools.api.TagScannerListener;
import org.nfctools.mf.MfConstants;
import org.nfctools.mf.classic.MfClassicReaderWriter;
import org.nfctools.mf.tools.AbstractCardTool;
import org.nfctools.scio.Terminal;
import org.nfctools.scio.TerminalMode;
import org.nfctools.utils.LoggingUnknownTagListener;

import javax.smartcardio.CardException;
import java.io.IOException;
import java.util.Arrays;

import static com.guness.CardRegistry.core.Constants.*;

/**
 * Created by guness on 15/06/2017.
 */
public class CardReaderWriterManager implements TagScannerListener {
    private static CardReaderWriterManager ourInstance = new CardReaderWriterManager();

    public static CardReaderWriterManager getInstance() {
        return ourInstance;
    }

    private static final byte[] CARD_KEY = MfConstants.TRANSPORT_KEY;

    private CardModel cardModel = null;
    private CardWriteListener listener = null;

    private CardReaderWriterManager() {
    }

    public void init() throws IOException {
        startListening();
    }

    public void setCardModel(CardModel cardModel, final CardWriteListener listener) {
        this.cardModel = cardModel;
        this.listener = listener;
    }

    private void startListening() throws IOException {
        final Terminal nfcReaderWriter = TerminalUtils.getAvailableTerminal();
        NfcAdapter nfcAdapter = new NfcAdapter(nfcReaderWriter, TerminalMode.INITIATOR, this);
        nfcAdapter.registerUnknownTagListerner(new LoggingUnknownTagListener());
        nfcAdapter.startListening();

        nfcAdapter.registerTagListener(new AbstractCardTool() {
            @Override
            public void doWithReaderWriter(MfClassicReaderWriter readerWriter) throws IOException {
                if (cardModel != null) try {
                    boolean numberSuccess = ReadWriteUtils.writeToMifareClassic1KCard(readerWriter, NUMBER_SECTOR_ID, NUMBER_BLOCK_ID, CARD_KEY, completeBlock(cardModel.getNumber()));
                    boolean secretSuccess = ReadWriteUtils.writeToMifareClassic1KCard(readerWriter, SECRET_SECTOR_ID, SECRET_BLOCK_ID, CARD_KEY, completeBlock(cardModel.getSecret()));
                    final boolean success = numberSuccess && secretSuccess;
                    if (success) {
                        cardModel.setRFID(ReadWriteUtils.readMifareClassic1KBlock(readerWriter, RFID_SECTOR_ID, RFID_BLOCK_ID, CARD_KEY));
                    }
                    Platform.runLater(() -> {
                        if (success) {
                            listener.onSuccess();
                        } else {
                            listener.onFail();
                        }
                    });
                } catch (CardException e) {
                    log.error("Cannot handle write: ", e);
                    Platform.runLater(() -> listener.onFail());
                } finally {
                    cardModel = null;
                }
            }
        });
    }

    @Override
    public void onScanningEnded() {
        System.currentTimeMillis();
    }

    @Override
    public void onScanningFailed(Throwable throwable) {
        System.currentTimeMillis();
    }

    @Override
    public void onTagHandingFailed(Throwable throwable) {
        System.currentTimeMillis();
    }

    public interface CardWriteListener {
        void onSuccess();

        void onFail();
    }

    private static byte[] completeBlock(String input) {
        if (input.length() == 16) {
            return input.getBytes();
        } else if (input.length() > 16) {
            throw new IllegalArgumentException("inout cannot be longer than 16");
        }
        byte[] block = new byte[16];
        Arrays.fill(block, (byte) 32);
        byte[] inputBytes = input.getBytes();
        System.arraycopy(inputBytes, 0, block, 0, inputBytes.length);
        return block;
    }
}
