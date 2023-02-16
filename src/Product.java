public class Product {

    /* TODO: create a class called Product with two private properties of name and priceInCents.
            Add a public static method called, find average price that takes in an array of products
            and finds the average price of all products. Add a main method to the class to test some
            values.
         */

    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public static int findAveragePrice(Product [] products){
        if (products.length == 0) {
            return 0;
        }
        int sum = 0;
        for (Product product : products){
            sum += product.priceInCents;
        }
        int avg =  sum / products.length;
        return avg;
    }

    public static void main(String[] args) {
        Product [] products = {
                new Product("Dish Soap", 575),
                new Product("Laundry Detergent", 1230),
                new Product("Lysol", 450),
                new Product("Trash Bags", 899)
        };
        System.out.println(products[0].getName());
        System.out.println(products[0].getPriceInCents());
        System.out.println("The average cost (in cents) for your products are: " + "¢" + Product.findAveragePrice(products));
    }
}
