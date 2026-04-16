import java.util.HashMap;
public class ProductPriceDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> product  = new HashMap<>();

        product .put(126, "Toothpaste");
        product .put(20, "Pen");
        product .put(32, "Smartwatch");
        product .put(45, "Headphones");
        product .put(14, "Primer");

        System.out.println(" all product  : " + product );


        boolean exists = product.containsKey("32,Smartwatch");

        System.out.println("It is set product  : " +  exists  );

        System.out.println("result clearly product :" + product);

        System.out.println("  price of one product :" + product.get(20));

        System.out.println("Update product :" + product);

        product.remove(126,"Toothpaste");

        System.out.println("after remove product :" + product);

        System.out.println("total number product :" + product.size());




    }
}


