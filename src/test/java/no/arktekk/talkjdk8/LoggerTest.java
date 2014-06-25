package no.arktekk.talkjdk8;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    @Test
    public void testCrash() {
        String msg = null;
        Logger.getGlobal().log(Level.CONFIG, "Message length " + msg.length());
    }

}
