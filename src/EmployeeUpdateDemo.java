import java.util.*;
public class EmployeeUpdateDemo {
    public static void main(String[] args){
        HashMap<Integer,String>   employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");

        System.out.println("Update all  employee  : " +  employee );

        boolean exists = employee.containsKey("32 , Omar");

        System.out.println("It is set employee  : " +  exists  );

        System.out.println("updated  employee :" + employee );

        employee.get(14);

        employee.put(555,"Ahmed");

        System.out.println(" after the second update employee :" + employee);







    }
}


