package org.shboland.resource;

import org.shboland.model.product.Product;
import org.shboland.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController implements IProductController {

    @Autowired
    private ProductService productService;

    @Override
    public List<Product> getProducts() {
        return productService.getProductList();
    }

    @Override
    public ResponseEntity addProduct(@RequestBody Product product) {

        productService.addProduct(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/")
                .buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }
}
