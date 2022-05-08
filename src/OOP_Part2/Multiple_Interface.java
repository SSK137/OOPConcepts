package OOP_Part2;

interface Employee{
    int empid=137;
    String ename="Saurabh";
    void empShowDetails();

}
interface Office{
    String Loc="Pune";
    String OName="ABC";
    void ShowOfficeDetails();
}
class Details implements Office,Employee {
    public void empShowDetails(){

        System.out.println("\nEmployee Name is " + ename +"\nEmployee Id is " + empid);
    }
    public void ShowOfficeDetails(){

        System.out.println("\nOffice Name is " + OName+ "\nOffice Location is " + Loc);
    }
}

public class Multiple_Interface {
    public static void main(String[] args) {
        Details d1= new Details();
        d1.empShowDetails();
        d1.ShowOfficeDetails();
    }
}
