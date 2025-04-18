package ru.yandex.school.trial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SumAb2 {
    public static void main(String[] args) throws FileNotFoundException {
        String defaultPath = "./";
        Scanner scanner = new Scanner(new File(defaultPath + "input.txt"));

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        PrintWriter writer = new PrintWriter(defaultPath + "output.txt");
        writer.println(a+b);
        writer.close();
    }
}
