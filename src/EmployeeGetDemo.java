import java.util.*;
public class EmployeeGetDemo {
    public static void main(String[] args){
        HashMap<String, Integer>   employee = new HashMap<>();

        employee.put("Ali" , 12);
        employee.put("Muna",20);
        employee.put("Omar",32);
        employee.put("Reem",45);
        employee.put("Noor",14);

        System.out.println("Update all  employee  : " +  employee );

        employee.get("110");

        System.out.println(" returned value clearly  employee  : " + " employee (110)" );

        employee.get("118");

        System.out.println("returned value clearly   employee  : " +  "employee (118)" );







    }
}


