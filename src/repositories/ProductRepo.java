package repositories;

import java.util.List;

import model.Product;

import java.util.ArrayList;

public class ProductRepo {

    private List<Product> productList = new ArrayList();

    public void addNewProduct(Product p){
        productList.add(p);
    }

    public Product getProductById(int i){

        boolean found = false;
        Product foundProduct = null;

        for(Product p: productList){
            if(productList.indexOf(p) == i){
                foundProduct = p;
                found = true;
            }else if(found == false){
                System.out.println("Product not found in product list.");
            }
        }
        return foundProduct;
    }

    public void deleteProduct(int i){
        
        boolean found = false;

        for(Product p: productList){
            if(productList.indexOf(p) == i){
                productList.remove(p);
                found = true;
            }else if(found == false){
                System.out.println("Product not found in product list.");
            }
        }
    }

    public void showAllProducts(){
        for(Product p: productList){
            
        }
    }
    
}