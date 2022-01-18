package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplication =1;

        System.out.println(fatorial + "! = ");
        for(int i = fatorial ; i >= 1 ; i -- ){
            multiplication = multiplication * i;

        }
        System.out.println(multiplication);



    }
}
