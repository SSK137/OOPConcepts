package OOP_Part2;
interface employee{
    int empid=137;
    String ename="Saurabh";
    void empShowDetails();

}
interface office extends Employee {
    String Loc="Ahmednagar";
    String OName="ABC";
    void ShowOfficeDetails();
}
class DetailsShow implements office {
    public void empShowDetails(){
        System.out.println("\nEmployee Name is " + Employee.ename +"\nEmployee ID Is " + Employee.empid);
    }
    public void ShowOfficeDetails(){
        System.out.println( "\nOffice NAme is " + OName+"\nOffice Location is " + Loc);
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        DetailsShow d1= new DetailsShow();
        d1.empShowDetails();
        d1.ShowOfficeDetails();
    }
}
