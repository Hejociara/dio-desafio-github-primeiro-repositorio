package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/**
 * @author : Hejociara do Vale
 */
public class EX3_highestAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int larger = 0;//mostrar o maior número
        int sum = 0;


        int count = 0;
        do {
            System.out.println("Numero: ");
            number = scan.nextInt();

            sum = sum + number;

            if (number > larger) larger = number;

            count = count + 1;
        }while (count < 5);

        System.out.println("Larger: " + larger);
        System.out.println("Average: " + sum/5);

    }

}
