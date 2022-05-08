package OOP_Part2;

public class PassByValue {
    int a = 10;
    void call(int a) {
        a = a+10;
    }

    public static void main(String[] args) {

        PassByValue pbv = new PassByValue();
        System.out.println("Before call-by-value: " + pbv.a);
        pbv.call(20);
        System.out.println("After call-by-value: " + pbv.a);
    }
}
