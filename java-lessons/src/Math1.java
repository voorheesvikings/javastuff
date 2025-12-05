class calculator {
    //write functions for add, subtract, multiply, divide, modulus, power, square root, etc
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    double divide (double a, double b) { // ! method overriding / polymorphism
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    int modulus(int a, int b) {
        return a % b;
    }


}

public class Math1 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Addition_Double: " + calc.add(5.3, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Multiplication_3: " + calc.multiply(5, 3, 2));
        System.out.println("Division: " + calc.divide(2, 3));
        System.out.println("Modulus: " + calc.modulus(5, 3));
    }
}
