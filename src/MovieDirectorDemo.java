import java.util.HashMap;
public class MovieDirectorDemo {
        public static void main(String[] args) {
            HashMap<String, String>   moviedirector   = new HashMap<>();

            moviedirector.put("Inception", "Christopher Nolan");
            moviedirector.put("Avatar", "James Cameron");
            moviedirector.put("Pulp Fiction", "Quentin Tarantino");
            moviedirector.put("Parasite", "Bong");
            moviedirector.put("Joker", "Todd Phillips");

            System.out.println(" all movies : " + moviedirector );

            System.out.println(" director  of one movies :" + moviedirector.get("Avatar,James Cameron"));

            boolean exists = moviedirector.containsKey("Brendan , Eich");

            System.out.println("It is set movies  : " +  exists  );

            System.out.println("result clearly movies :" + moviedirector);

            moviedirector.put("Avatar", "James Francis Cameron");


            System.out.println("Update movies :" + moviedirector);

            moviedirector.remove("Guido" , "van");

            System.out.println("after remove book :" + moviedirector);

            System.out.println("total number book :" + moviedirector.size());




        }
    }





