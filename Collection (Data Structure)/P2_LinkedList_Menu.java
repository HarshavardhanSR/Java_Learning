
import java.util.*;

// Menu Based program for linked list 
public class P2_LinkedList_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;
        while(true){
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Insert after element");
            System.out.println("5. Delete at beginning");
            System.out.println("6. Delete at end");
            System.out.println("7. Delete at position");
            System.out.println("8. Delete the element");
            System.out.println("9. Search");
            System.out.println("10. Display");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    list.addFirst(sc.nextInt());
                break;
                case 2:
                    System.out.print("Enter the element to be inserted: ");
                    list.addLast(sc.nextInt());
                break;
                case 3:
                    System.out.print("Enter the position: ");
                    System.out.print("Enter the element to be inserted: ");
                    list.add(sc.nextInt(), sc.nextInt());
                break;
                case 4:
                    System.out.print("Enter the element to be inserted: ");
                    int newElement = sc.nextInt(); // Element to be inserted

                    System.out.print("Enter the element after which to be inserted: ");
                    int existingElement = sc.nextInt(); // Existing element after which to insert

                    // Find the index of the element after which to insert the new element
                    int index = list.indexOf(existingElement);

                    // If the element exists, insert after it
                    if (index != -1) {
                        // Insert the new element at position index + 1
                        list.add(index + 1, newElement);
                        System.out.println("Updated List: " + list);
                    } else {
                        System.out.println("Element '" + existingElement + "' not found in the list.");
                    }
                break;

                case 5:
                    list.removeFirst();
                break;
                case 6:
                    list.removeLast();
                break;
                case 7:
                    System.out.println("Enter the position you want to delete");
                    list.remove(sc.nextInt());
                break;
                case 8:
                    System.out.println("Enter the element to be deleted: ");
                    list.remove(list.indexOf(sc.nextInt()));
                break;
                case 9:
                    System.out.println("Enter the element to serach :");
                    if(list.contains(sc.nextInt())){
                        System.out.println("Element found");
                    }else{
                        System.out.println("Element not found");
                    }
                break;
                case 10:
                    System.out.println(list);
                break;
                default:
                    System.out.println("Invalid Syntax");
                break;
            }
        }
    }
}
