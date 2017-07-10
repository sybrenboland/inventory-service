package org.shboland.service;

import org.shboland.model.product.Product;
import org.shboland.model.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);

        return productList;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
