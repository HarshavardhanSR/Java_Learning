import java.util.HashSet;
import java.util.Scanner;

public class P4_HashSetMenuProgram {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- HashSet Operations Menu -----");
            System.out.println("1. Add an Element");
            System.out.println("2. Remove an Element");
            System.out.println("3. Check if an Element Exists");
            System.out.println("4. Display All Elements");
            System.out.println("5. Check the Size of HashSet");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add an element
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = sc.nextInt();
                    if (hashSet.add(elementToAdd)) {
                        System.out.println("Element " + elementToAdd + " added successfully.");
                    } else {
                        System.out.println("Element " + elementToAdd + " already exists in the HashSet.");
                    }
                    break;

                case 2: // Remove an element
                    System.out.print("Enter the element to remove: ");
                    int elementToRemove = sc.nextInt();
                    if (hashSet.remove(elementToRemove)) {
                        System.out.println("Element " + elementToRemove + " removed successfully.");
                    } else {
                        System.out.println("Element " + elementToRemove + " does not exist in the HashSet.");
                    }
                    break;

                case 3: // Check if an element exists
                    System.out.print("Enter the element to check: ");
                    int elementToCheck = sc.nextInt();
                    if (hashSet.contains(elementToCheck)) {
                        System.out.println("Element " + elementToCheck + " exists in the HashSet.");
                    } else {
                        System.out.println("Element " + elementToCheck + " does not exist in the HashSet.");
                    }
                    break;

                case 4: // Display all elements
                    System.out.println("HashSet Elements: " + hashSet);
                    break;

                case 5: // Check the size of the HashSet
                    System.out.println("Size of the HashSet: " + hashSet.size());
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
