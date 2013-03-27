package no.arktekk.talkjdk8;

import org.apache.commons.io.FileUtils;

import java.io.File;

import static no.arktekk.talkjdk8.util.Throwables.propagate;

public class CheckedExceptionsDemo {

    public static void main(String[] args) {
        String content = propagate(() -> FileUtils.readFileToString(new File(args[0])));
        System.out.println(content);
    }

}
