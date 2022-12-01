public class abs{
    public static void main(String args[]) {
        horse H = new horse();
        H.breed = "mustang";
        System.out.println(H.breed);
        H.walk();

        chichen c = new chichen();
        
        c.walk();

    }
}
abstract class animals{
    void eat(){
        System.out.println("eats food");
    }
    abstract void walk();
}
class horse extends animals{
    String breed;
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chichen extends animals{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


