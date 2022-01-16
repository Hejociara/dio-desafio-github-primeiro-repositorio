package one.digitalinovation.basecamp;

public class Main {

        public static void main(String[] args) {

            // Retornos
            System.out.println("Returns Exercise");

            double squareArea = Quadrilateral.area(3);
            System.out.println("Square area is: " + squareArea);

            double rectangleArea = Quadrilateral.area(5,5);
            System.out.println("Rectangle area is: " + rectangleArea);

            double trapezeArea = Quadrilateral.area(7,8,9);
            System.out.println("Trapeze area is: " + trapezeArea);

        }
    }

