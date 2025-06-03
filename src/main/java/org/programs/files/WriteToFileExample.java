package org.programs.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFileExample {
    public static void main(String[] args) {
        // Define the file path and content
        Path filePath = Paths.get("output-file.txt");
        List<String> content = List.of(
                "Hello, this is the first line.",
                "This is the second line.",
                "And this is the third line."
        );

        try {
            // Write multiple lines to the file
            Files.write(filePath, content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}