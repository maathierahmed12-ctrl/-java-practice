import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(126, "Ali");
        employee.put(20, "Muna");
        employee.put(32, "Omar");
        employee.put(45, "Reem");
        employee.put(14, "Noor");

        System.out.println(" full  employee  : " + employee);

        for (Map.Entry<Integer, String> x : employee.entrySet()) {

            System.out.println(x.getKey() + "ID -> 101 ,Ali "  + x.getValue());
        }

          employee.put(555, "Ahmed");

        System.out.println(" all employee IDs   : " + employee.keySet());

        System.out.println("all employee names  employee :" + employee.values());


        System.out.println("update employee :" + employee);
    }

}


