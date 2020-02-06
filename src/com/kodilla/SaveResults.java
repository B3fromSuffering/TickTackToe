package com.kodilla;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SaveResults {

    public static void save(String result) {

        try(FileWriter fw = new FileWriter("Results.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println(result);
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    public static void load() {

        Path file = Paths.get("Results.txt");

        try (Stream<String> stream = Files.lines(file)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("wystąpił błąd: " + e);
        }
    }
}



