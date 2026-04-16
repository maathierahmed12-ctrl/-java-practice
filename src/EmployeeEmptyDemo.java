import java.util.HashMap;
import java.util.Map;

public class EmployeeEmptyDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");


        System.out.println("Update all  employee  : " +  employee );

        System.out.println("--- isEmpty ---");
        String emptyText = "";
        System.out.println("Is empty: " + emptyText.isEmpty());
        System.out.println("Is blank: " + emptyText.isBlank());

        System.out.println("result employee :" + employee);

        employee.clear();

        System.out.println("after clearing employee  : " +  employee);

        System.out.println("--- isEmpty ---");
        String emptyMap = "";
        System.out.println("Is empty: " + emptyText.isEmpty());
        System.out.println("Is blank: " + emptyText.isBlank());


        System.out.println("final result clearly employee  : " +  employee);



        }






    }

