import java.util.*;
public class EmployeeClearDemo {
    public static void main(String[] args){
        HashMap<Integer,String>   employee = new HashMap<>();

        employee.put(126,"Ali");
        employee.put(20 ,"Muna");
        employee.put(32,"Omar");
        employee.put(45, "Reem");
        employee.put(14,"Noor");

        System.out.println(" set number  employee : " +  employee.size());

        employee.clear();

        System.out.println(" after clearing employee  : " +  employee );

        System.out.println(" empty  employee : " +  employee.size());


    }
}





