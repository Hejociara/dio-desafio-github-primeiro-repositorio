package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/**
 * @author : Hejociara do Vale
 * 17/01/2022
 */
public class Ex2_Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // qndo se pede para digitar, utiliza-se Scanner, ou seja, pede a entrada de dados pelo teclado

        int grade;

        System.out.println("Grade: ");
        grade = scan.nextInt();

        while(grade < 0 ||  grade > 10){
            System.out.println("Nota Inválida! Digite novamente: ");
            grade = scan.nextInt();

        }
    }
}
