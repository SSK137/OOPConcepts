package OOP_Part2;

public final class Final_Keyword {

    final int bikeno = 1;
    final String bikename= "FZ-S";
    final void BikeDetails(){
        System.out.println( "\nBike Name is "+bikename +"\nBike No IS " + bikeno);
    }
    public static void main(String[] args) {
        Final_Keyword b1 = new Final_Keyword();
        b1.BikeDetails();
    }
}
