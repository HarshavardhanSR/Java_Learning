
import java.beans.DesignMode;


public class P2_Static_Instance {
     int instanceVar = 5;
    static int staticVar = 10;
    public void instaceMethod(){
        System.out.println("Instance method");
        System.out.println("Instance Variable : "+instanceVar);
        System.out.println("Static Variable : "+staticVar);
    }
    public static void staticMethod(){
        System.out.println("Static method");
        System.out.println("Static Variable : "+staticVar);
    }
    public static void main(String[] args) {
        P2_Static_Instance obj = new P2_Static_Instance();
        obj.instaceMethod();
        P2_Static_Instance.staticMethod();
    }
}
