import java.util.HashMap;
import java.util.Map;

public class StudentMarksDemo {
        public static void main(String[] args) {
            HashMap<Integer, String> student  = new HashMap<>();

            student .put(126, "Ali");
            student .put(20, "Muna");
            student .put(32, "Omar");
            student .put(45, "Reem");
            student .put(14, "Noor");

            System.out.println(" all  mark   IDs student  : " + student );
            System.out.println(" mark student :" + student.get(20));

            boolean exists = student.containsKey("32,Omar");

            System.out.println("It is set student  : " +  exists  );

            System.out.println("result student :" + student);

            student.put(54,"Ahmed");

            System.out.println("Update student :" + student);

            student.remove(126,"Ali");

            System.out.println("after remove student :" + student);

            System.out.println("total number student :" + student.size());





        }
        }




