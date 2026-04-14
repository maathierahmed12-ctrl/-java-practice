import java.util.*;
public class EmployeeCheckDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");

        System.out.println("Update all  employee  : " +  employee );

          boolean exists = employee.containsKey("32,Omar");

            System.out.println("It is set employee  : " +  exists  );

           boolean notexists = employee.containsKey("32,Omar");

         System.out.println("It is set employee  : " +  notexists  );

        System.out.println(" result clearly  employee  : " +  employee );

         boolean exists1 = employee.containsValue("Reem,32");

        System.out.println("It is set employee  : " +  exists  );

        System.out.println(" result clearly employee  : " +  employee  );





    }
    }






