package one.digitalinovation.basecamp;

public class Quadrilateral {

        public static double area(double side) {

            return side * side;
        }

        public static double area(double side1, double side2) {

            return side1 * side2;
        }

        public static double area(double largerBase, double SmallerBase, double hight) {

            return ((largerBase+SmallerBase)*hight) / 2; //return interrompe e retorna
        }

        public static void xpto() {

            System.out.println("Before");
            return;
        }

        public static double abc() {
            return 1.6;
        }

    }

