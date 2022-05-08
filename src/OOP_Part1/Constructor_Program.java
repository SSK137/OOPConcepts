package OOP_Part1;
public class Constructor_Program {
    public String str;
    public Constructor_Program()
    {
        System.out.println("Inside the default constructor");
    }
    public Constructor_Program(String strName){
        this.str = strName;
        System.out.println(strName);
    }
    public static void main(String[] args) {
        Constructor_Program d2c = new Constructor_Program();
        Constructor_Program d2c1 = new Constructor_Program("SAURABH");
        }
}
