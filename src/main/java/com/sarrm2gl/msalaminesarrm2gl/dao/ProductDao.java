package com.sarrm2gl.msalaminesarrm2gl.dao;

import com.sarrm2gl.msalaminesarrm2gl.model.Product;

import java.util.List;

public interface ProductDao {
     List<Product>findAll();
     Product ProductfindById(int id);
     Product Productsave(Product product);
}
