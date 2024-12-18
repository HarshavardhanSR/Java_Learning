import java.util.*;
public class P5_Scanner_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = sc.nextLine();
        System.out.println("Enter your last name:");
        String lname = sc.nextLine();
        System.out.println("Enter your age:");
        int age  = sc.nextInt();
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        System.out.println("Name: "+fname+" "+lname);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
