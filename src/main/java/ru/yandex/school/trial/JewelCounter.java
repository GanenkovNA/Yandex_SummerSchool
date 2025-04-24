package ru.yandex.school.trial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class JewelCounter {
    public static void main (String[] args){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String jewels_input = reader.readLine();
            String stones_input = reader.readLine();

            HashSet<Character> jewelSet = new HashSet<>();
            for(char c : jewels_input.toCharArray())
                jewelSet.add(c);

            int count = 0;

            for (char stone : stones_input.toCharArray()){
                if (jewelSet.contains(stone))
                    count++;
            }

            System.out.println(count);
        }catch (IOException e){
            System.err.println("Ошибка при чтении ввода: " + e.getMessage());
        }
    }
}
