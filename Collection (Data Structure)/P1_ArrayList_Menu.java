// Menu based program for array list
import java.util.*;
public class P1_ArrayList_Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int choice, num;
        while (true) {
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    num = sc.nextInt();
                    list.add(num);
                break;
                case 2:
                    System.out.println("Enter the element to delete:");
                    num = sc.nextInt();
                    list.remove((Integer)num);
                break;
                case 3:
                    System.out.println("ArrayList: "+list);
                break;
                case 4:
                    System.out.println("Exiting !!!");
                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice !!");
                    break;
            }
        }
    }
}