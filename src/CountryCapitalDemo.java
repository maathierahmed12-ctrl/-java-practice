import java.util.HashMap;
public class CountryCapitalDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> countrycapital  = new HashMap<>();

        countrycapital .put(126, "Oman");
        countrycapital .put(20, "Egypt");
        countrycapital .put(32, "France");
        countrycapital .put(45, "Tokyo");
        countrycapital .put(14, "Japan");

        System.out.println(" all country  : " + countrycapital );

        System.out.println(" capital of one country :" + countrycapital.get(20));

        boolean exists = countrycapital.containsKey("32,France");

        System.out.println("It is set country  : " +  exists  );

        System.out.println("result clearly country :" + countrycapital);

        countrycapital.put(666,"Oman");

        System.out.println("Update country :" + countrycapital);

        countrycapital.remove(126,"Toothpaste");

        System.out.println("after remove country :" + countrycapital);

        System.out.println("total number country :" + countrycapital.size());




    }
}



