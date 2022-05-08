package OOP_Part1;

public class Encapsulation_Code {
    public static void main(String[] args) {
        Encp2 d1 = new Encp2();
        String Name = d1.getName();
        System.out.println(Name);
        d1.setEmpAdd("Ahmednagar");
        String Addres = d1.empAdd;
        System.out.println(Addres);
    }
}
