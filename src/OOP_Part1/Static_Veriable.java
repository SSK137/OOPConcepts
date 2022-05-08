package OOP_Part1;

public class Static_Veriable {
    public String empName;
    public int empNo;
    static String CompNAme="Bridgelabz"; // Static Variable

    public Static_Veriable(String eName , int eNo){
        this.empName = eName;
        System.out.println("Name is " + eName );
        this.empNo = eNo;
        System.out.println("E. Number is " + eNo );

    }
    //Static Block
    static{
        System.out.println("Inside the Static Block");
    }

    public static void main(String[] args) {
        Static_Veriable d2s= new Static_Veriable("Saurabh",123);
        Static_Veriable d2s1= new Static_Veriable("Pranav",456);
        Static_Veriable d2s2= new Static_Veriable("Dnyaneshwar",789);
    }
}
