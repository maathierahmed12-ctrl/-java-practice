import java.util.HashMap;
public class CourseMapDemo {
    public class CourseTrainerDemo {

        public static void main(String[] args) {
            HashMap<String, String>   course   = new HashMap<>();

            course.put("Java", "Ahmed");
            course.put("Python", "Sara");
            course.put("AI", "Omar");
            course.put("SQL", "Layla");
            course.put("Web", "Ali");


            System.out.println(" all course : " + course );

            System.out.println(" trainer of one course :" + course.get("Java,Ahmed"));

            boolean exists = course.containsKey("AI , Omar");

            System.out.println("It is set course  : " +  exists  );

            System.out.println("result clearly course :" + course);

            boolean notexists = course.containsKey("AI , Omar");

            System.out.println("It is set course  : " +  notexists  );

            course.put("Web", "Ali");

            System.out.println("Update book :" + course);

            course.remove("SQL", "Layla");

            System.out.println("after remove book :" + course);

            System.out.println("total number book :" + course.size());




        }
    }




}
