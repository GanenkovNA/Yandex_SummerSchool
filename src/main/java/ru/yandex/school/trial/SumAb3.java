package ru.yandex.school.trial;

import java.util.Scanner;

public class SumAb3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);

        scanner.close();
    }
}
