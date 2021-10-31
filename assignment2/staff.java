package assignment2;

/**
 *
 * @author HP
 */
public class staff extends employee {
    String title ;

    public staff(String title, String office, double salary, String name, String address, String emiladdress, int phonnumber) {
        super(office, salary, name, address, emiladdress, phonnumber);
        this.title = title;
    }
     public String toString() {
        return name + " Staff";
    }
    
}
