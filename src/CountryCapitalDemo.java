import java.util.HashMap;
public class CountryCapitalDemo {

    public static void main(String[] args) {
        HashMap<String, String> countrycapital  = new HashMap<>();

        countrycapital .put("Oman" , "Muscat");
        countrycapital .put("Egypt","Cairo");
        countrycapital .put("France","Paris");
        countrycapital .put( "Japan","Tokyo");
        countrycapital .put("Brazil","Rio de Janeiro");

        System.out.println(" all country  : " + countrycapital );

        System.out.println(" capital of one country :" + countrycapital.get(20));

        boolean exists = countrycapital.containsKey("France,Paris");

        System.out.println("It is set country  : " +  exists  );

        System.out.println("result clearly country :" + countrycapital);

        countrycapital.put("Oman" , "Muscat");

        System.out.println("Update country :" + countrycapital);

        countrycapital.remove("Japan","Tokyo");

        System.out.println("after remove country :" + countrycapital);

        System.out.println("total number country :" + countrycapital.size());




    }
}



