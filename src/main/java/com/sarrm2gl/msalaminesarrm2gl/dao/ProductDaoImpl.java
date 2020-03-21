//mouhamadou lamine sarr m2gl
// ici nous avons ma classe produitDaoImpl qui perme d'implementer l'inerface
package com.sarrm2gl.msalaminesarrm2gl.dao;

import com.sarrm2gl.msalaminesarrm2gl.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product>products=new ArrayList<>();
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350));
        products.add(new Product(2, new String("Aspirateur Robot"), 500));
        products.add(new Product(3, new String("Table de Ping Pong"), 750));
    }



    //lite des produit
    @Override
    public List<Product>findAll() {
        return products;
    }


    //trouver un produit par son id
    @Override
    public Product ProductfindById(int id) {
        for (Product product : products) {
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
    }

    //methode pour ajouter un produit
    @Override
    public Product Productsave(Product product) {
        products.add(product);
        return product;
    }
}
