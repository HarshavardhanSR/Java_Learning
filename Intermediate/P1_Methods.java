class example{
    int instaticVar = 10;
    static int StaticVar = 20;
    public void showDetails(){
        System.out.println("Instance Variable: "+instaticVar);
        System.out.println("Static Variable: "+StaticVar);
        staticMethod();
    }
    public static void staticMethod(){
        System.out.println("Static Method");
    }
}
public class P1_Methods{
    public static void main(String[] args) {
        example obj = new example();
        obj.showDetails();
        obj.staticMethod();
    }
}