import java.util.HashMap;
public class CourseTrainerDemo {

    public static void main(String[] args) {
        HashMap<String, String>   coursetrainer   = new HashMap<>();

        coursetrainer .put("Java", "Ahmed");
        coursetrainer.put("Python", "Sara");
        coursetrainer.put("AI", "Omar");
        coursetrainer.put("SQL", "Layla");
        coursetrainer.put("Web", "Ali");


        System.out.println(" all course : " + coursetrainer );

        System.out.println(" trainer of one course :" + coursetrainer.get("Ahmed"));

        boolean exists = coursetrainer.containsKey("Brendan , Eich");

        System.out.println("It is set course  : " +  exists  );

        System.out.println("result clearly course :" + coursetrainer);

        coursetrainer.put("Python", "Eng.Mona");

        System.out.println("Update book :" + coursetrainer);

        coursetrainer.remove("Guido" , "van");

        System.out.println("after remove book :" + coursetrainer);

        System.out.println("total number book :" + coursetrainer.size());




    }
}



