package de.hfu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unglaublich wichtiges Programm für das OSSWE Praktikum 05
 * @author Cedric Casper
 * @version 1.0
 */
public class consoleReader {
    /**
     * Die Hauptklasse - halt dich fest - nimmt einen Input über die
     * Konsole entgegen und dann - unglaublich! - wird dieser in
     * Uppercase umgewandelt auf der Konsole ausgegeben.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(input.toUpperCase());
    }
}