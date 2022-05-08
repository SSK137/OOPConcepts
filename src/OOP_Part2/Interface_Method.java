package OOP_Part2;
interface HelloWorld{
    //default visibility is public
    void displayName();
}
class PrintName implements HelloWorld{
    @Override
    public void displayName() {
        System.out.println("SSK");
    }
}

public class Interface_Method {
    public static void main(String[] args) {
        PrintName pn = new PrintName();
        pn.displayName();
        //pn.arg;
    }
}