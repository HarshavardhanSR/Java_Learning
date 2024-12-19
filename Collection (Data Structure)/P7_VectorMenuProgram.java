
import java.util.Scanner;
import java.util.Vector;

public class P7_VectorMenuProgram {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Vector Operations Menu -----");
            System.out.println("1. Add an Element");
            System.out.println("2. Insert an Element at a Specific Index");
            System.out.println("3. Remove an Element by Index");
            System.out.println("4. Retrieve an Element by Index");
            System.out.println("5. Check if an Element Exists");
            System.out.println("6. Display All Elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add an element
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = sc.nextInt();
                    vector.add(elementToAdd);
                    System.out.println("Element " + elementToAdd + " added to the Vector.");
                    break;

                case 2: // Insert an element at a specific index
                    System.out.print("Enter the index to insert the element: ");
                    int indexToInsert = sc.nextInt();
                    System.out.print("Enter the element to insert: ");
                    int elementToInsert = sc.nextInt();
                    if (indexToInsert >= 0 && indexToInsert <= vector.size()) {
                        vector.add(indexToInsert, elementToInsert);
                        System.out.println("Element " + elementToInsert + " inserted at index " + indexToInsert + ".");
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;

                case 3: // Remove an element by index
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = sc.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < vector.size()) {
                        int removedElement = vector.remove(indexToRemove);
                        System.out.println("Element " + removedElement + " removed from index " + indexToRemove + ".");
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;

                case 4: // Retrieve an element by index
                    System.out.print("Enter the index of the element to retrieve: ");
                    int indexToRetrieve = sc.nextInt();
                    if (indexToRetrieve >= 0 && indexToRetrieve < vector.size()) {
                        System.out.println("Element at index " + indexToRetrieve + ": " + vector.get(indexToRetrieve));
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;

                case 5: // Check if an element exists
                    System.out.print("Enter the element to check: ");
                    int elementToCheck = sc.nextInt();
                    if (vector.contains(elementToCheck)) {
                        System.out.println("Element " + elementToCheck + " exists in the Vector.");
                    } else {
                        System.out.println("Element " + elementToCheck + " does not exist in the Vector.");
                    }
                    break;

                case 6: // Display all elements
                    System.out.println("Vector elements: " + vector);
                    break;

                case 7: // Exit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
