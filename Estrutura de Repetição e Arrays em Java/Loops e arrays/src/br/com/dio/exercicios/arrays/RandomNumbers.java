package br.com.dio.exercicios.arrays;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();//classe que gera números aleatórios

        int[] randomNumbers = new int [20];

        for(int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;

        }
        System.out.print("\nRandom Numbers: ");
        for (int number : randomNumbers) {
            System.out.println((number +1) + " ");
        }

        System.out.print("\nRandom number successor: ");
        for (int number : randomNumbers) {
            System.out.println((number -1) + " ");
        }
    }
}

