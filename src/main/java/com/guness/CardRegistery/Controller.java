package com.guness.CardRegistery;

import com.guness.CardRegistery.core.Constants;
import com.guness.CardRegistery.util.ReadWriteUtils;
import javafx.fxml.Initializable;
import org.nfctools.NfcAdapter;
import org.nfctools.api.TagScannerListener;
import org.nfctools.mf.classic.MfClassicReaderWriter;
import org.nfctools.mf.tools.AbstractCardTool;
import org.nfctools.scio.Terminal;
import org.nfctools.scio.TerminalMode;
import org.nfctools.utils.LoggingUnknownTagListener;

import javax.smartcardio.CardException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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

                try {
                    ReadWriteUtils.dumpMifareClassic1KBlock(readerWriter, 0, 0, new ArrayList<>(knownKeys));
                } catch (CardException e) {
                    log.error("Cannot read sector: " + Constants.SECTOR_ID + " with keys " + Arrays.toString(knownKeys.toArray()));
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
