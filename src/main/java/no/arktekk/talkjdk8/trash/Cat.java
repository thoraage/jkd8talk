package no.arktekk.talkjdk8.trash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cat {

    public static void main(String[] args) {
        for (String arg : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arg))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.err.println("File " + arg + " not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
