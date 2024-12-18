public class P7_Instance_var {
    public String name= "Code with Passion";
    public int age = 14;
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        P7_Instance_var ivar = new P7_Instance_var();
        ivar.display();
    }
    
}
