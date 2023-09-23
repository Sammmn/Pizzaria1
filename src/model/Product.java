package model;

import java.util.Scanner;

public class Product {
    
    private String name;
    private Double price;
    private Category category;
    private CategoryList categoryList;

    public Product(String name, Double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public void createNewProduct(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Insert the product name: ");
        String pn = read.nextLine();
        System.out.println("Insert the product price: ");
        Double pp = read.nextDouble();

        System.out.println("Select the product category: ");
        categoryList.showCategories();

        int pc = read.nextInt();
        read.close();

        Category category = categoryList.getCategoryById(pc);

        Product product = new Product(pn, pp, category);
    }


}
