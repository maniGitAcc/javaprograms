package org.programs.files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteFileStream {
    public static void main(String[] args) {
        String filePath = "output.txt";
        List<String> content = Arrays.asList("Line 1", "Line 2", "Lne 3");

        try {
            Files.write(Paths.get(filePath), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}