// program to demonstrate all the loops in java
public class p12_loops {
    public static void main(String[] args) {
        // for loop
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }
        // while loop
        System.out.println("\nWhile Loop");
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + (++j));
            
        }
        // do-while loop
        System.out.println("\nDo-While Loop");
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + (k++));
        } while (k < 5);
        // foreach loop
        System.out.println("\nFor-Each Loop");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Foreach loop iteration: " + number);
        }
    }
}
