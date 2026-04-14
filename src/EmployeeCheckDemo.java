import java.util.*;
public class EmployeeCheckDemo {
    public static void main(String[] args){
        HashMap<String, Integer>   employee = new HashMap<>();

        employee.put("Ali" , 12);
        employee.put("Muna",20);
        employee.put("Omar",32);
        employee.put("Reem",45);
        employee.put("Noor",14);

        System.out.println("Update all  employee  : " +  employee );

          boolean exists = employee.containsKey("Omar,32");

            System.out.println("It is set employee  : " +  exists  );

           boolean notexists = employee.containsKey("Omar,32");

         System.out.println("It is set employee  : " +  notexists  );

        System.out.println(" result clearly  employee  : " +  employee );

         boolean exists1 = employee.containsValue("Reem,32");

        System.out.println("It is set employee  : " +  exists  );

        System.out.println(" result clearly employee  : " +  employee  );





    }
    }






