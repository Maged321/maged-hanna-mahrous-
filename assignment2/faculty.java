package assignment2;

/**
 *
 * @author HP
 */
public class faculty extends employee {
    double work_hour;
     String rank;

    public faculty(double work_hour, String rank, String office, double salary, String name, String address, String emiladdress, int phonnumber) {
        super(office, salary, name, address, emiladdress, phonnumber);
        this.work_hour = work_hour;
        this.rank = rank;
    }
   
     
      public String toString() {
        return name + " Faculty";
    }
}


