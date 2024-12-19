
import java.util.HashMap;
import java.util.Scanner;

public class P5_HashMapMenuProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- HashMap Operations Menu -----");
            System.out.println("1. Add a Key-Value Pair");
            System.out.println("2. Remove a Key-Value Pair");
            System.out.println("3. Search for a Value by Key");
            System.out.println("4. Check if a Key Exists");
            System.out.println("5. Display All Key-Value Pairs");
            System.out.println("6. Check the Size of HashMap");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add a key-value pair
                    System.out.print("Enter the key (integer): ");
                    int key = sc.nextInt();
                    System.out.print("Enter the value (string): ");
                    sc.nextLine(); // Clear the buffer
                    String value = sc.nextLine();
                    hashMap.put(key, value);
                    System.out.println("Key-Value pair (" + key + ", " + value + ") added successfully.");
                    break;

                case 2: // Remove a key-value pair
                    System.out.print("Enter the key to remove: ");
                    int keyToRemove = sc.nextInt();
                    if (hashMap.containsKey(keyToRemove)) {
                        String removedValue = hashMap.remove(keyToRemove);
                        System.out.println("Removed Key-Value pair (" + keyToRemove + ", " + removedValue + ").");
                    } else {
                        System.out.println("Key " + keyToRemove + " does not exist in the HashMap.");
                    }
                    break;

                case 3: // Search for a value by key
                    System.out.print("Enter the key to search: ");
                    int searchKey = sc.nextInt();
                    if (hashMap.containsKey(searchKey)) {
                        System.out.println("Value for key " + searchKey + ": " + hashMap.get(searchKey));
                    } else {
                        System.out.println("Key " + searchKey + " does not exist in the HashMap.");
                    }
                    break;

                case 4: // Check if a key exists
                    System.out.print("Enter the key to check: ");
                    int keyToCheck = sc.nextInt();
                    if (hashMap.containsKey(keyToCheck)) {
                        System.out.println("Key " + keyToCheck + " exists in the HashMap.");
                    } else {
                        System.out.println("Key " + keyToCheck + " does not exist in the HashMap.");
                    }
                    break;

                case 5: // Display all key-value pairs
                    System.out.println("HashMap Key-Value Pairs: " + hashMap);
                    break;

                case 6: // Check the size of the HashMap
                    System.out.println("Size of the HashMap: " + hashMap.size());
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
