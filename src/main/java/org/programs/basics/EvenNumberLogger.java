package org.programs.basics;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class EvenNumberLogger {
    private static final Logger logger = Logger.getLogger(EvenNumberLogger.class.getName());

    public static void main(String[] s) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> logger.info("Even number = " + n));
    }

}
