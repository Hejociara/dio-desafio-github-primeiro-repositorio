package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex4_EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amountNumbers;
        int number;
        int amountEvens = 0;
        int amountOdds = 0;

        System.out.println("Amount of Numbers: ");
        amountNumbers = scan.nextInt();

        //quantidade de vezes que eu quero que o número se repita
        int count = 0;
        do {
            System.out.println("Numbers: ");
            number = scan.nextInt();

            if (number % 2 == 0) amountEvens++; //se o número for divido por 2 e o resto for 0, ele será par
            else amountOdds++;

            count++;
        } while (count < amountNumbers);

        System.out.println("Amount Even: " + amountEvens);
        System.out.println("Amount Odd: " + amountOdds);
    }

    }


