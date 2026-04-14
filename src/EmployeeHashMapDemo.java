import java.util.*;
public class EmployeeHashMapDemo {
    public static void main(String[] args){
        HashMap<String, Integer>  employeeIDs = new HashMap<>();

        employeeIDs.put("Ali" , 12);
        employeeIDs.put("Muna",20);
        employeeIDs.put("Omar",32);
        employeeIDs.put("Reem",45);
        employeeIDs.put("Noor",14);

        System.out.println("Update all employeeIDs : " + employeeIDs);

        employeeIDs.put("Ahmed",14);

        System.out.println("Update  employeeIDs : " + employeeIDs);









    }
}

