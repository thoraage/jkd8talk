package no.arktekk.talkjdk8;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsDemo {

    public static void main(String[] args) {
        try {
            System.out.println(FileUtils.readFileToString(new File(args[0])));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
