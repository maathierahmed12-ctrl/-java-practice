import java.util.HashMap;
import java.util.Map;

public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(126, "Ali");
        employee.put(20, "Muna");
        employee.put(32, "Omar");
        employee.put(45, "Reem");
        employee.put(14, "Noor");

        System.out.println(" all employee IDs   : " + employee.keySet());

        for (Integer key : employee.keySet()) {
        }
        for (Map.Entry<Integer, String> t : employee.entrySet()) {

            if (employee.containsKey(t.getKey())) {

                System.out.println("yes employee Map has " + t.getKey() + "ID" + t.getValue() + "101,Ali");

                employee.put(111, "Ahmed");

                for (Integer key : employee.keySet()) {
                }
                for (Map.Entry<Integer, String> x : employee.entrySet()) {

                    if (employee.containsKey(t.getKey())) {

                        System.out.println("yes employee Map has " + x.getKey() + "ID" + x.getValue() + "101,Ali");

                    }
                }
            }
        }
    }
}








