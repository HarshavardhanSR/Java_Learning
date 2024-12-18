
import java.util.List;

public class P13_Array {
    public static void main(String[] args) {
        // types of intitalization 
        int[] arr1 = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};
        int[] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        int arr5[] = new int[]{1, 2, 3, 4, 5};
        String [] fruits={"Apple","Banna","Orange"};
        for(int arr : arr1){
            System.out.println("Square: " +arr*arr);
        }
        for (int sum : arr2){
            System.out.println("Sum: " + (sum+sum));
        }
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        // Largest of all
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("array length: " + arr1.length);
        System.out.println(arr5 instanceof Object);
        System.out.println(arr5.getClass().getName());
        System.out.println(fruits.getClass().getName());
    }
}
