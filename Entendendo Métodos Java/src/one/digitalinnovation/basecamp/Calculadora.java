package one.digitalinnovation.basecamp;

/**
 * @author: Hejociara do Vale
 *  operações
 */
public class Calculadora {
 //static possibilita que eu chame o método a parti de uma classe
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é igual a: " + resultado);
    }
        public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é igual a: " + resultado);
    }
    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é igual a: " + resultado);

    }
    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " dividido " + numero2 + " é igual a: " + resultado);

    }
}
