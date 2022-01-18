package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex5_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Times Table: ");
        int timesTable = scan.nextInt();

        System.out.println("Times table of " + timesTable);

        for(int i = 1; i <= 10; i++ ){
            System.out.println(timesTable + " X " + i + "=" + (timesTable*i));


        }

    }
}
