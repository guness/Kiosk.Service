package com.guness.CardRegistery;

import javafx.fxml.Initializable;
import org.nfctools.NfcAdapter;
import org.nfctools.api.TagScannerListener;
import org.nfctools.mf.MfLoginException;
import org.nfctools.mf.block.MfBlock;
import org.nfctools.mf.classic.*;
import org.nfctools.mf.tools.AbstractCardTool;
import org.nfctools.scio.Terminal;
import org.nfctools.scio.TerminalMode;
import org.nfctools.utils.LoggingUnknownTagListener;
import org.nfctools.utils.NfcUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements TagScannerListener, Initializable {


    public Controller() {
    }


    public void startListening() throws IOException {
        final Terminal nfcReaderWriter = TerminalUtils.getAvailableTerminal();
        NfcAdapter nfcAdapter = new NfcAdapter(nfcReaderWriter, TerminalMode.INITIATOR, this);
        nfcAdapter.registerUnknownTagListerner(new LoggingUnknownTagListener());
        nfcAdapter.startListening();
        nfcAdapter.registerTagListener(new AbstractCardTool() {
            @Override
            public void doWithReaderWriter(MfClassicReaderWriter readerWriter) throws IOException {
                MemoryLayout memoryLayout = readerWriter.getMemoryLayout();

                for (int sectorId = 0; sectorId < memoryLayout.getSectors(); sectorId++) {
                    for (byte[] key : knownKeys) {
                        try {
                            MfClassicAccess access = new MfClassicAccess(new KeyValue(Key.A, key), sectorId, 0,
                                    memoryLayout.getBlocksPerSector(sectorId));
                            MfBlock[] mfBlock = readerWriter.readBlock(access);
                            for (int blockId = 0; blockId < mfBlock.length; blockId++) {
                                System.out.println("S" + sectorId + "|B" + blockId + " Key: " + NfcUtils.convertBinToASCII(key)
                                        + " " + mfBlock[blockId]);
                            }
                            break;
                        } catch (MfLoginException e) {
                            log.info("Cannot read sector: " + sectorId + " with key " + NfcUtils.convertBinToASCII(key));
                        }
                    }
                }
            }
        });
        System.out.println("Waiting for tags, press ENTER to exit");
    }

    public void onScanningEnded() {
    }

    public void onScanningFailed(Throwable throwable) {

    }

    public void onTagHandingFailed(Throwable throwable) {

    }

    public void initialize(URL location, ResourceBundle resources) {
        try {
            startListening();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
