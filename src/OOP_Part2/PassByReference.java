package OOP_Part2;

public class PassByReference {
    int a = 10;
    void callMethod(PassByReference b)
    {
        b.a=b.a+10;
    }

    public static void main(String  [] args) {
        PassByReference pbr = new PassByReference();
        System.out.println("Before calling by Ref " + pbr.a);
        pbr.callMethod(pbr);
        System.out.println("After calling by Ref " + pbr.a);
    }
}
