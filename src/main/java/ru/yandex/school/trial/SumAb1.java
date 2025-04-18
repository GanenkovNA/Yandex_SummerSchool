package ru.yandex.school.trial;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumAb1 {
    private final static String defaultPath = "C:\\Users\\Kit\\Documents\\projects\\Yandex_SummerSchool\\src\\main\\java\\ru\\yandex\\school\\trial\\";
    private final static File inputFile = new File(defaultPath + "input.txt");

    public static void main(String[] args) throws IOException {
        if (inputFile.exists())
            answerInFile();
        else {
            System.out.println("Файл \"" + inputFile.getPath() + "\" не найден");
            answerInConsole();
        }
        BufferedReader reader = Files.newBufferedReader(Paths.get("file.txt"));

    }

    public static int sumAb (Scanner scanner){
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        return a+b;
    }

    public static void  answerInFile(){
        File outputFile = new File(defaultPath + "output.txt");
        if (outputFile.exists() && !outputFile.canWrite()) {
            System.out.println("Ошибка: \"" + outputFile.getPath() + "\" защищён от записи");
            return;
        }

        try (Scanner scanner = new Scanner(inputFile)) {
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println(sumAb(scanner));
            writer.close();
        } catch (FileNotFoundException e) {
            // Теоретически сюда можно попасть, если файл исчез после проверки exists()
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void answerInConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для сложения: ");
        System.out.println("Сумма чисел: " + sumAb(scanner));
        scanner.close();
    }
}
