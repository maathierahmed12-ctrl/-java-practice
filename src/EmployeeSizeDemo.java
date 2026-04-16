import java.util.*;
public class EmployeeSizeDemo {
    public static void main(String[] args){
        HashMap<Integer,String>   employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");

        System.out.println("Update all  employee  : " +  employee );

        System.out.println("  total number  employee : " +  employee.size()  );

        employee.put(50,"Fatma");

        System.out.println("Update  employee  : " +  employee );

        System.out.println("  total number  employee : " +  employee.size()  );


    }
}


