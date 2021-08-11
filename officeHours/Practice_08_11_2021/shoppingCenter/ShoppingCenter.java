package Practice_08_11_2021.shoppingCenter;


import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCenter {
    public static void main(String[] args) {

        // CHECK REPOSITORY
        System.out.println("===== CHECK REPOSITORY ===");
        System.out.println(StockManagement.electronics);
        System.out.println(StockManagement.clothes);

        // CREATE CATEGORY CLASS WITH PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITH PRODUCTS  ===");
        Category catClothes=new Category("Clothes",StockManagement.clothes);
        System.out.println("catClothes = " + catClothes);

        // CREATE CATEGORY CLASS WITHOUT PRODUCTS
        System.out.println("===== CREATE CATEGORY CLASS WITHOUT PRODUCTS  ===");
        Category catElectronics=new Category("Electronics");
        System.out.println("catElectronics = " + catElectronics);


        // ADD FIRST PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD FIRST PRODUCT FOR ELECTRONICS  ===");
        catElectronics.addProduct(new Product("USB Cable",100,3));
        System.out.println("catElectronics = " + catElectronics);


        // ADD SAME PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD SAME PRODUCT FOR ELECTRONICS  ===");
        catElectronics.addProduct(new Product("USB Cable",100,3));
        System.out.println("catElectronics = " + catElectronics);


        // ADD SAME PRODUCT FOR ELECTRONICS WITH DIFFERENT PRICE
        System.out.println("===== ADD SAME PRODUCT FOR ELECTRONICS WITH DIFFERENT PRICE  ===");
        catElectronics.addProduct(new Product("USB Cable",100,5));
        System.out.println("catElectronics = " + catElectronics);

        // ADD LIST OF PRODUCT FOR ELECTRONICS
        System.out.println("===== ADD LIST OF PRODUCT FOR ELECTRONICS   ===");
        catElectronics.addProduct(StockManagement.electronics);
        System.out.println("catElectronics = " + catElectronics);

        // ADD LIST OF PRODUCT FOR ELECTRONICS WITH SAME PRODUCT OR DIFFERENT PRICE
        System.out.println("===== ADD LIST OF PRODUCT FOR ELECTRONICS WITH SAME PRODUCT OR DIFFERENT PRICE  ===");
        ArrayList<Product> addElectronics=new ArrayList<>();
        addElectronics.addAll(Arrays.asList(
                new Product("USB Cable",100,3),
                new Product("USB Cable",100,5),
                new Product("Battery",100,10)
        ));
        catElectronics.addProduct(addElectronics);
        System.out.println("catElectronics = " + catElectronics);





    }
}
