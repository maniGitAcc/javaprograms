package org.programs.strings;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class ScannerEx {
    public static void main(String[] s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text :");
        String text = scanner.nextLine();
        System.out.println("The entered text is :" + text);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("Your age is : " + age);
        System.out.println("Enter the salary :");
        double sal = scanner.nextDouble();
        System.out.println("Your salary is : " + sal);
        DecimalFormat format = new DecimalFormat("0.00");
        String salary = format.format(sal);
        System.out.println("Your formatted salary is : " + salary);

        scanner.close();

    }
}
