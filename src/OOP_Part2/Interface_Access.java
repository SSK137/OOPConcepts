package OOP_Part2;

interface AccessField{
    public static  int rollno= 137;
    String name= "Saurabh";
}
class Accessing implements AccessField{

}
public class Interface_Access {
    public static void main(String[] args) {
        Accessing as = new Accessing();             //as is an object for Accessing Class
        System.out.println("Interface fields is " + as.rollno);
        System.out.println("Interface Field is " +as.name);
    }
}