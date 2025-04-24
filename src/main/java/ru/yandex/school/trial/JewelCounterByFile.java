package ru.yandex.school.trial;

import java.io.*;
import java.util.HashSet;

public class JewelCounterByFile {
    private final static String defaultPath = "./";
    private final static File inputFile = new File(defaultPath + "input.txt");

    public static void main (String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
            String jewels_input = reader.readLine().trim();
            String stones_input = reader.readLine().trim();

            if (jewels_input == null || stones_input == null) {
                System.err.println("Ошибка: файл содержит недостаточно строк");
                return;
            }

            System.out.println("Jewels: [" + jewels_input + "] length=" + jewels_input.length());
            System.out.println("Stones: [" + stones_input + "] length=" + stones_input.length());


            HashSet<Character> jewelSet = new HashSet<>();
            for(char c : jewels_input.toCharArray())
                jewelSet.add(c);

            int count = 0;

            for (char stone : stones_input.toCharArray()){
                if (jewelSet.contains(stone))
                    count++;
            }

            PrintWriter writer = new PrintWriter(defaultPath + "output.txt");
            writer.println(count);
            writer.close();
        }catch (FileNotFoundException e){
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
