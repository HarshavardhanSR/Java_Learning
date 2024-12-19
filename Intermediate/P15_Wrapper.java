public class P15_Wrapper {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Object
        int num = 10;
        Integer numObj = num;  // int to Integer (autoboxing)

        // Unboxing: Object to Primitive
        Integer anotherNumObj = new Integer(20);
        int anotherNum = anotherNumObj;  // Integer to int (unboxing)

        System.out.println("numObj: " + numObj);  // Output: 10
        System.out.println("anotherNum: " + anotherNum);  // Output: 20

        // Using Wrapper Class Methods
        String str = "123";
        int parsedInt = Integer.parseInt(str);  // Parsing a String to int
        System.out.println("Parsed int: " + parsedInt);  // Output: 123

        // Checking if a character is a digit
        char c = '5';
        boolean isDigit = Character.isDigit(c);
        System.out.println("Is '5' a digit? " + isDigit);  // Output: true
    }
}
