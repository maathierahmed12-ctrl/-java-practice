import java.util.HashMap;
public class Product1PriceDemo {
    public static void main(String[] args) {
        HashMap< Double , String> product  = new HashMap<>();

        product .put(12.6, "Toothpaste");
        product .put(2.0, "Pen");
        product .put(3.2, "Smartwatch");
        product .put(4.5, "Headphones");
        product .put(1.4, "Primer");

        System.out.println(" all product  : " + product );


        boolean exists = product.containsKey("3.2,Smartwatch");

        System.out.println("It is set product  : " +  exists  );

        System.out.println("result clearly product :" + product);

        boolean notexists = product.containsKey("3.2,Smartwatch");

        System.out.println("It is set product  : " +  notexists  );

        System.out.println("result clearly product :" + product);

        product .put(4.4, "pencil");

        System.out.println("  price of one product :" + product.get(2.0));

        System.out.println("Update product :" + product);

        product.remove(12.6,"Toothpaste");

        System.out.println("after remove product :" + product);

        System.out.println("total number product :" + product.size());




    }
}


