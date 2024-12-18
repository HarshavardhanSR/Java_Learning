class FirstClass{
    void printMessage(){
        System.out.println("First, Class");
    }
}
class SecondClass{
    void printMessage(){
        System.out.println("Second, Class");
    }
}
public class P2_Multi_Class {
    public static void main(String[] args){
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        first.printMessage();
        second.printMessage();
    }
}
