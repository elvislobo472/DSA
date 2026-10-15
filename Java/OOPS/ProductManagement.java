package Coding.Java.OOPS;



class Product{

    String productName;
    int productID;
    double price;
    int quantity;

    Product(String productName, int productID, double price, int quantity){
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;

    }


    public void displayProduct(){
        System.out.println("Product name: " +productName );
        System.out.println("Product ID: " + productID );
        System.out.println("Product Price: " + price );
        System.out.println("Quantity: " + quantity);
    }

    public void restock(int amount){
        quantity += amount;
    }

    public void sell(int amount){
        if(amount > quantity) {
            System.out.println("Sale is rejected as we have only "+quantity+ " in stock currently");
        }else{
            quantity -= amount;
        }
    }




}


public class ProductManagement {

    public static void main(String[] args) {

        Product p1 = new Product("Monitor", 101, 15000, 50);

        Product p2 = new Product("Keyboard", 102, 5000, 50);


        p1.restock(10);

        p1.displayProduct();

        System.out.println();

        p1.sell(7);
        p1.displayProduct();

        System.out.println();

        p2.restock(15);

        p2.displayProduct();

        System.out.println();

        p2.sell(12);
        p2.displayProduct();





    }



}

