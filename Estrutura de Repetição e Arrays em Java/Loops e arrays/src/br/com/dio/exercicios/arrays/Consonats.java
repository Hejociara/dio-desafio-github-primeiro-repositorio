package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Consonats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consonants = new String[6]; // para identificar que é um array coloca-se o []
    int amountConsonants =0;
    int count =0;
    do {
        System.out.println("Letter: ");
        String letter = scan.next();

        if (!(letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u"))) {
        consonants[count] = letter;
        amountConsonants++;
    }
    count ++;

    }while(count < consonants.length);

        System.out.println("Consonants: ");
    for ( String consonant : consonants){
        if (consonant != null) // se consoante for diferente de nulo, ele n imprime
        System.out.println(consonant + " ");

        }
        System.out.println("Amount of consonants: ");
    }

}
