package Practice_08_11_2021.shoppingCenter;

import java.util.ArrayList;

public class Category {

    public String name;
    public ArrayList<Product> products;
    public static String companyName;
    public static int totalEarning;


    public Category(String name) {
        this(name,new ArrayList<>());
        //this.name = name;
        //products=new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }




    public void addProduct(Product product){

        for (Product p : products) {  // refers each product of arrayList
            if(p.name.equals(product.name)){
                if(p.price==product.price){
                    p.quantity+=product.quantity;
                    System.out.println(product.name+" is already exist");
                    System.out.println("Quantity is increaased by "+ product.quantity);
                }
                else
                {
                    System.out.println(product.name+ " is already exist");
                    System.out.println("check "+ product.name+" price");
                }
                return;
            }
        }

        products.add(product);
        System.out.println(product.name+" is added");

    }

    public void addProduct(ArrayList<Product> product){

        for (Product p : product) { // refers each product
            addProduct(p);
        }

    }
    /*
    public void sellProduct(Product product){

        for (Product p : products) {
            if (p.name.equals(product.name)) {
                if (p.quantity >= product.quantity) {
                    p.quantity-= product.quantity;
                    totalEarning+= product.quantity* product.price;
                    System.out.println(product.name+" quantity is decreased by "+ product.quantity);

                } else {
                    System.out.println(product.name+" quantity is not enough to sell");
                }
                return;
            }
        }
        System.out.println(product.name+ " does not exist");


    }

    public void sellProduct(ArrayList<Product> product){

        for (Product p : product) {
            sellProduct(p);
        }

    }
    */


    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
