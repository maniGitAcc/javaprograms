package org.programs.files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class ReadFileStream {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
