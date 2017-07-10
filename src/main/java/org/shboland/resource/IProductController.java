package org.shboland.resource;

import org.shboland.model.product.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/products")
public interface IProductController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    List<Product> getProducts();

    @RequestMapping(path = "", method = RequestMethod.POST)
    ResponseEntity addProduct(@RequestBody Product product);
}
