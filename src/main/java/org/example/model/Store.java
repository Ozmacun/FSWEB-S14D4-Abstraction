package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("white", 15, "grand white");
        products[1] = new Bread("white", 10,"white little", "white","brown");
        products[2] = new Coke("Diet",20,"Oldschool diet coke", 1.5,false);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }
    }
}