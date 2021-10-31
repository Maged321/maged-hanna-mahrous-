package assignment2;

public class student extends person {
     final String status1 = "Freshman";
    final String status2 = "Sophomore";
    final String status3 = "Junior";
    final String status4 = "Senior";

    public student(String name, String address, String emiladdress, int phonnumber) {
        super(name, address, emiladdress, phonnumber);
    }

   public String toString() {
        return name + " Student";
    }
   
    
}
