package model;

import java.util.ArrayList;
import java.util.List;

public class CategoryList {
    
        private List<Category> categoryList = new ArrayList();

        public void addCategory(Category category){
            categoryList.add(category);
        }

        public void showCategories(){
            int cont = 0;

            for(Category c: categoryList){
                System.out.println(cont+"- "+c.getName());
                cont++;
            }
        }

        public Category getCategoryById(int i){
            boolean found = false;
            Category foundCategory = null;

            for(Category category: categoryList){
                if(categoryList.indexOf(category) == i){
                found = true;
                foundCategory = category;
                }else if (found == false){
                    System.out.println("Category not found in category list.");
                }
            }
            return foundCategory;
        }
         
    }
}
