import java.util.HashMap;
public class Book1AuthorDemo {
    public static void main(String[] args) {
        HashMap<String, String>  bookauthor  = new HashMap<>();

        bookauthor .put("James", "Gosling");
        bookauthor .put("Guido" , "van");
        bookauthor .put("Bjarne" , "Stroustrup");
        bookauthor .put("Anders" , "Hejlsberg");
        bookauthor .put("Brendan" , "Eich");


        System.out.println(" all book  : " + bookauthor );

        System.out.println(" capital of one book :" + bookauthor.get("Brendan , Eich"));

        boolean exists = bookauthor.containsKey("Brendan , Eich");

        System.out.println("It is set book  : " +  exists  );

        System.out.println("result clearly book :" + bookauthor);


        boolean notexists = bookauthor.containsKey("Brendan , Eich");

        System.out.println("It is set book  : " +  notexists  );

        System.out.println("result clearly book :" + bookauthor);


        bookauthor.put("Robert" , "Martin");

        System.out.println("Update book :" + bookauthor);

        bookauthor.remove("Guido" , "van");

        System.out.println("after remove book :" + bookauthor);

        System.out.println("total number book :" + bookauthor.size());




    }
}




