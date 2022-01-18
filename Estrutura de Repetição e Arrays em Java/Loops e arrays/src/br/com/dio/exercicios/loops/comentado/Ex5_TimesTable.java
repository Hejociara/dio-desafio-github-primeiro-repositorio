package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex5_TimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Times Table: ");
        int timesTable = scan.nextInt();

        System.out.println("Times table of " + timesTable);

        for(int i = 1; i <= 10; i++ ){
            System.out.println(timesTable + " X " + i + "=" + (timesTable*i));


        }

    }

    public static class ReverseOrder {
        public static void main(String[] args) {
            int[] vector = {-5, -6, 15, 50, 8, 4};

            System.out.println("Vector: ");
            int count = 0;
            while (count < (vector.length)) {
                System.out.print(vector[count] + " ");
                count++;
            }
            System.out.println("\n Vector: ");
            for(int i = (vector.length -1); i == 0; i--) {
                System.out.println(vector[i] + " ");
            }
        }
    }
}
