import java.util.*;
import java.util.HashMap;
public class EmployeeKeysValuesDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(126, "Ali");
        employee.put(20, "Muna");
        employee.put(32, "Omar");
        employee.put(45, "Reem");
        employee.put(14, "Noor");

        System.out.println("Update all  employee  : " + employee);

        System.out.println(" all employee IDs   : " + employee.keySet());

        System.out.println("all employee names  employee :" + employee.values());

        employee.put(555, "Ahmed");

        System.out.println("update employee :" + employee.keySet() + employee.values() );
    }

}