// menu driven program for Stack

import java.util.Scanner;
import java.util.Stack;
public class P3_Stack_menu {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n----- Stack Operations Menu -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        switch (choice) {
                case 1: // Push operation
                    System.out.print("Enter the element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    System.out.println("Element pushed: " + element);
                    break;
                case 2: // Pop operation
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 3: // Peek operation
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4: // Check if stack is empty
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5: // Display stack
                    System.out.println("Stack elements: " + stack);
                    break;
                case 6: // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while (choice != 6);
        sc.close();  
    }          
}

