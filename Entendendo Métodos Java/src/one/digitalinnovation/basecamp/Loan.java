package one.digitalinnovation.basecamp;

/**
 * @author : Hejociara do Vale
 * Exercício aula de métodos
 */
public class Loan {

    public static int getTwoInstallments() {
        return 2;
    }

    public static int getThreeInstallments() {
        return 3;
    }

    public static double getTwoInstallmentsFee() {
        return 0.3;
    }

    public static double getThreeInstallmentsFee() {
        return 0.45;
    }

    public static void calculate(double value. int installments) {

        if (installments == 2) {

            double finalValue = value + (value * getTwoInstallmentsFee());

            System.out.println("Final value loan for 2 installments is: R$  " + finalValue);
        } else if (installments == 3) {

            double finalValue = value + (value * getThreeInstallmentsFee());

            System.out.println("Final value loan for 3 installments is: R$  " + finalValue);
        }
        else {
            System.out.println("Number of installments not accepted ");

        }
    }

}
