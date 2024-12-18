public class P16_String {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");
        String str3 = "Hello, World!".intern();
        // Equals refrence
        System.out.println(str == str1); // true
        System.out.println(str == str2); // 
        // Equals content
        System.err.println(str.equals(str1));
        System.out.println(str.equals(str2));
        // Concatientaion 
        System.out.println(str1. concat(str3).concat(str2));
        // length
        System.out.println(str1.length());
        // Sub String
        System.out.println(str1.substring(7, 12));
        // Case Conversion
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        // Replace
        System.out.println(str1.replace("World", "Java"));
        // Split
        String[] split = str1.split(" ");
        System.out.println(split);
        // String Builder Usage
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb);
    }
}
