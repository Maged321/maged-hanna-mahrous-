package assignment2;
import java.util.*;
public class person {
    String name ,address ,emiladdress;
    int phonnumber;
    public person()
    {
    
    }
    public person (String name,String address,String emiladdress,int phonnumber ){
        this.name=name;
        this.address=address;
        this.emiladdress=emiladdress;
        this.phonnumber=phonnumber;
    }

    public String tostring(){
        return name +"person";
    }
    
    
    
}
