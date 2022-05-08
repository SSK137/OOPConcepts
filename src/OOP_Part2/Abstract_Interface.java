package OOP_Part2;

interface AbInterface{
    void PrintName();
}
abstract class AbClass implements AbInterface{
    abstract void PrintSurname();
    public void PrintName(){
        System.out.println("Saurabh");
    }
}
