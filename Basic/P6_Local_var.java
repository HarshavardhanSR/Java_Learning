public class P6_Local_var {
    public void display(){
        int x = 10; // local variable
        String y = "Hello"; // local variable
        System.out.println("Local variable x = " + x);
        System.out.println("Local variable y = " + y);
    }
    public static void main(String[] args) {
        // Local variable declaration
        P6_Local_var ex = new P6_Local_var();
        ex.display();

    }
    
}
