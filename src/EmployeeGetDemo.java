import java.util.*;
public class EmployeeGetDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");


        System.out.println("Update all  employee  : " +  employee );

        employee.get(110);

        System.out.println(" returned value clearly  employee  : " + " employee (110)" );

        employee.get(118);

        System.out.println("returned value clearly   employee  : " +  "employee (118)" );

        for (Map.Entry<Integer, String> x : employee.entrySet()) {

            System.out.println(x.getKey() + "ID -> 101 ,Ali "  + x.getValue());

            System.out.println("after all updates employee :" + employee);
        }






    }
}


