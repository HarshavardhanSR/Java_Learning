
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class P11_OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println(calc.add(2, 3));       // Calls method with 2 int parameters
        System.out.println(calc.add(1, 2, 3));    // Calls method with 3 int parameters
        System.out.println(calc.add(2.5, 3.5));   // Calls method with 2 double parameters
    }
}
