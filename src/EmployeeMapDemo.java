import java.util.HashMap;
public class EmployeeMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> employeeIDs = new HashMap<>();

        employeeIDs.put(126,"Ali");
        employeeIDs.put(20 ,"Muna");
        employeeIDs.put(32,"Omar");
        employeeIDs.put(45, "Reem");
        employeeIDs.put(14,"Noor");

        System.out.println(" all employeeIDs : " + employeeIDs );

        System.out.println(" director  of one employeeIDs :" + employeeIDs.get("14,Noor"));

        boolean exists = employeeIDs.containsKey("14,Noor");

        System.out.println("It is set employeeIDs  : " +  exists  );

        System.out.println("result clearly employeeIDs :" + employeeIDs);

        employeeIDs.put(41, "Ahmed");


        System.out.println("Update employeeIDs :" + employeeIDs);

        employeeIDs.remove(20 ,"Muna");

        System.out.println("after remove employeeIDs :" + employeeIDs);

        System.out.println("total number employeeIDs :" + employeeIDs.size());




    }
}



