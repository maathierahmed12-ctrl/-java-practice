import java.util.HashMap;
import java.util.Map;
public class EmployeeCompareUpdateDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(126, "Ali");
        employee.put(20, "Muna");
        employee.put(32, "Omar");
        employee.put(45, "Reem");
        employee.put(14, "Noor");

        System.out.println("Update all  employee  : " + employee);

        employee.get(14);

        System.out.println("current value   employee :" + employee);

        employee.put(555, "Ahmed");

        employee.get(14);


        System.out.println(" after the second update employee :" + employee);


    }
}
