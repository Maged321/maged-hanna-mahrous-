package assignment2;
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person p1=new person("maged","minia","maged@emil",012);
         System.out.println(p1.toString());
        student s=new student("maged","min","mag@",012);
         System.out.println(s.toString());
        employee e = new employee(
                "王五",25, "5467890", "78976@qq.com","room101", 399999);
        System.out.println(e.toString());


    }
    
}
