package OOP_Part1;

class A{
    int a;
    public int SSK() {
        System.out.println("hello");
        return 0;
    }
    public void meth1() {
        System.out.println("I am method 1 of class A");
    }
}
class B extends A{
    @Override
    public void meth1() {
        System.out.println("I am method 1 of class B");
    }
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }
}
