import java.util.*;
public class P9_Operators_Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;
        do{
            System.out.println("\t Menu: ");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction: ");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Modules");
            System.out.println("6 Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Enter first number: ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int num2 = sc.nextInt();
                        System.out.println("Addition of two numbers is: "+(num1+num2));
                    break;
                case 2:
                        System.out.println("Enter first number: ");
                        int num3 = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int num4 = sc.nextInt();
                        System.out.println("Subtraction of two numbers is: "+(num3-num4));
                    break;
                case 3:
                        System.out.println("Enter first number: ");
                        int num5 = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int num6 = sc.nextInt();
                        System.out.println("Multiplication of two numbers is: "+(num5*num6));
                    break;
                case 4:
                        System.out.println("Enter first number: ");
                        int num7 = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int num8 = sc.nextInt();
                        if (num8 != 0) {
                            System.out.println("Division of two numbers is: "+(num7/num8));
                            
                        }
                    break;
                case 5:
                        System.out.println("Enter first number: ");
                        int num9 = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int num10 = sc.nextInt();
                        System.out.println("Modules of two numbers is: "+(num9%num10));
                    break;
                case 6:
                        System.out.println("Exiting !!!");
                        break;

                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 6);
    }
}
