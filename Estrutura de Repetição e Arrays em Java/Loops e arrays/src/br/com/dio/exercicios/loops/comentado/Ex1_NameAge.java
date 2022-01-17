package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex1_NameAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // esse comando permite ler através do teclado

        String name; //valores
        int age;         // valores

        while(true){ //quando se utiliza while, deve-se colocar true or false
            System.out.println("Name: ");
            name = scan.next(); // lê valores, next retorna uma string, Insere valores que podem ser realizados pelo usuário
            if (name.equals("0")) break;

            System.out.println("Age: ");
            age = scan.nextInt(); //lê valores, coloca-se nextInt, pq o valor é do tipo inteiro
        }
        System.out.println("Continua aqui...");
    }
}
