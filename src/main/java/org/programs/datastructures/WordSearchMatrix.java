package org.programs.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WordSearchMatrix {
    public static List<String> findWords(char[][] matrix) {
        List<String> words = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find words row-wise
        for (int i = 0; i < rows; i++) {
            StringBuilder rowWord = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                if (Character.isLetter(matrix[i][j])) {
                    rowWord.append(matrix[i][j]);
                } else {
                    addWord(words, rowWord);
                }
            }
            addWord(words, rowWord);
        }

        // Find words column-wise
        for (int j = 0; j < cols; j++) {
            StringBuilder colWord = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                if (Character.isLetter(matrix[i][j])) {
                    colWord.append(matrix[i][j]);
                } else {
                    addWord(words, colWord);
                }
            }
            addWord(words, colWord);
        }

        return words;
    }

    private static void addWord(List<String> words, StringBuilder word) {
        if (word.length() > 0) {
            words.add(word.toString());
            word.setLength(0); // Clear the StringBuilder
        }
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'a', 'b', 'c', 'o', 'd','a', 'b', 'c', 'e', 'd'},
                {'e', 'o', 'f', 'g', 'h','a', 'b', 'c', 'm', 'i'},
                {'i', 'y', 'k', 'l', 'i','s', 't', 'c', 'o', 'f'},
                {'a', 'b', 'c', 'j', 'd','a', 'b', 'a', 'n', 'd'},
                {'e', 'a', 'r', 'g', 'h','a', 'b', 'd', 'e', 'd'},
                {'i', 'j', 'k', 'l', 'a','m', 'b', 'o', 'y', 'd'},
                {'a', 'b', 'c', 'k', 'i','n', 'g', 'c', 'c', 'd'},
                {'c', 'o', 'a', 'l', 'h','a', 'b', 'c', 'a', 'd'},
                {'i', 'j', 'k', 'l', 't','a', 'b', 'c', 't', 'd'}
        };

        List<String> foundWords = findWords(matrix);
        System.out.println("Words found in the matrix: " + foundWords);
    }
}
