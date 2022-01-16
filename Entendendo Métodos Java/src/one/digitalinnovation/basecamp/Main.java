package one.digitalinnovation.basecamp;

/**
 * @author: Hejociara do Vale
 * Classe principal do exercício
 * 16/06/2022
 */
public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Calculator Exercise");
        Calculadora.soma(3, 6); // (3,6) parâmetros
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Message
        System.out.println("Message Exercise");
        Message.getMessage(9);
        Message.getMessage(14);
        Message.getMessage(1);
        Message.getMessage(7);

        //loan
        System.out.println("Loan Exercise");
        Loan.calculate(1000,  Loan.getTwoInstallments());
        Loan.calculate(1000,  Loan.getThreeInstallments());
        Loan.calculate(1000, 5);

    }
}
