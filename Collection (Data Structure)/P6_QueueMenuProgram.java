import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P6_QueueMenuProgram {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Queue Operations Menu -----");
            System.out.println("1. Enqueue (Add an Element)");
            System.out.println("2. Dequeue (Remove an Element)");
            System.out.println("3. Peek (View Front Element)");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Display All Elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Enqueue
                    System.out.print("Enter the element to enqueue: ");
                    int elementToAdd = sc.nextInt();
                    queue.add(elementToAdd); // Add element to the queue
                    System.out.println("Element " + elementToAdd + " added to the queue.");
                    break;

                case 2: // Dequeue
                    if (!queue.isEmpty()) {
                        int removedElement = queue.poll(); // Remove element from the queue
                        System.out.println("Element " + removedElement + " removed from the queue.");
                    } else {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    }
                    break;

                case 3: // Peek
                    if (!queue.isEmpty()) {
                        System.out.println("Front element: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 4: // Check if queue is empty
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 5: // Display all elements
                    System.out.println("Queue elements: " + queue);
                    break;

                case 6: // Exit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

