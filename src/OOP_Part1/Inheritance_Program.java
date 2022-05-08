package OOP_Part1;

class Inheritance {
    String color = "White";

}
class dog extends Inheritance {
    String color = "black";

    public void color() {
        System.out.println(color);
        System.out.println(super.color);

    }
}

public class Inheritance_Program {
    public static void main(String[] args) {

        dog dg = new dog();
        dg.color();

    }
}
