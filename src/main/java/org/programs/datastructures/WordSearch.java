package org.programs.datastructures;

import java.util.*;

public class WordSearch {

    public static void main(String[] args) {
        char[][] matrix = {
                {'a', 'b', 'c', 'o', 'd', 'a', 'b', 'c', 'e', 'd'},
                {'e', 'o', 'f', 'g', 'h', 'a', 'b', 'c', 'm', 'i'},
                {'i', 'y', 'k', 'l', 'l', 's', 't', 'c', 'o', 'f'},
                {'t', 'b', 'c', 'j', 't', 'o', 'o', 'a', 'n', 'd'},
                {'h', 'a', 'n', 'g', 'h', 'n', 'b', 'd', 'e', 'd'},
                {'e', 'j', 'k', 'l', 'a', 'a', 'b', 'o', 'x', 'd'},
                {'a', 'b', 'c', 'k', 'i', 's', 'g', 'c', 'c', 'd'},
                {'c', 'o', 'a', 'l', 'h', 'r', 'b', 'c', 'a', 'd'},
                {'i', 'j', 'k', 'l', 't', 'i', 'b', 'c', 't', 'd'}
        };

        List<String> wordsToFind = Arrays.asList("one");
        List<String> foundWords = findWords(matrix, wordsToFind);
        System.out.println("Words found in the matrix: " + foundWords);
    }

    public static List<String> findWords(char[][] matrix, List<String> wordsToFind) {
        List<String> foundWords = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0) return foundWords;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]);
            }
            String rowString = sb.toString();
            for (String word : wordsToFind) {
                if (rowString.contains(word) && !foundWords.contains(word)) {
                    foundWords.add(word);
                }
            }
        }
        for (int j = 0; j < cols; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                sb.append(matrix[i][j]);
            }
            String colString = sb.toString();
            for (String word : wordsToFind) {
                if (colString.contains(word) && !foundWords.contains(word)) {
                    foundWords.add(word);
                }
            }
        }
        return foundWords;
    }
}