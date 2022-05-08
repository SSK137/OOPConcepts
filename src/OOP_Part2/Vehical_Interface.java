package OOP_Part2;
interface vehicals{
    double engine_version= 1.2;
    String engine_Name = "R8";
    void EngDetails();
}
class ShowEngDetails implements vehicals{
    public void EngDetails(){
        System.out.println("Engine Name is " + engine_Name + "\nEngine Version is "+ engine_version);
    }
}


public class Vehical_Interface {
    public static void main(String[] args) {
        ShowEngDetails sed = new ShowEngDetails();
        sed.EngDetails();

    }
}