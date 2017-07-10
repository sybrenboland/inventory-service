package org.shboland.resource;

import org.shboland.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController implements IProductController {

    private List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> getProducts() {

        Product product1 = new Product(1, "Wooden chair", "This is a oak hand made chair.");
        productList.add(product1);
        Product product2 = new Product(2, "Suede poof", "Original maroccan poof.");
        productList.add(product2);

        return productList;
    }

    @Override
    public ResponseEntity addProduct(@RequestBody Product product) {

        productList.add(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/")
                .buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }
}
