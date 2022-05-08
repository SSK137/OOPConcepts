package OOP_Part2;

public class Abstact_Interface extends AbClass {
    public void PrintSurname() {
        System.out.println("KODAM");
    }

    public static void main(String[] args) {
        Abstact_Interface a1 = new Abstact_Interface();
        a1.PrintSurname();
        a1.PrintName();
    }
}
