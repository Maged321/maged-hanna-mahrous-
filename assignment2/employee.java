package assignment2;

/**
 *
 * @author HP
 */
import java.util.*;
public class employee extends person {
    String office;
    double salary;
    Date date_hired = new Date();
    public employee(String office, double salary, String name, String address, String emiladdress, int phonnumber) {
        super(name, address, emiladdress, phonnumber);
        this.office = office;
        this.salary = salary;
    }
    public String toString() {
        return name + " Employee";
    }
    

    
    
    
}
