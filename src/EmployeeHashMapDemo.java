import java.util.*;
public class EmployeeHashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");

        System.out.println("Update all employeeIDs : " + employee);

        employee.put(14,"Ahmed");

        System.out.println("Update  employeeIDs : " + employee);









    }
}

