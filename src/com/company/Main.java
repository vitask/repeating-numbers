package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        int arraySize = Integer.parseInt(reader.readLine());
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + "-ый элемент: ");
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Массив при вводе: " + Arrays.toString(array));

            Map<Integer, Integer> counts = new HashMap<>();

            for (int x : array) {
                if (!counts.containsKey(x))
                    counts.put(x, 0);
                counts.put(x, 1 + counts.get(x));
            }

            for (int x : counts.keySet())
                System.out.printf("Число массива %d имеет количество повторов: %d%n", x, counts.get(x));

    }
}