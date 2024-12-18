public class P10_if_ifElse {
    public static void main(String[] args) {
        int age = 25;
        if(age>=18){
            if(age>=60){
                System.out.println("You are a senior citizen");
            }
            else{
                System.out.println("You are an adult");
            }
        }
        else{
            System.out.println("You are a minor");
        }
    }
}
