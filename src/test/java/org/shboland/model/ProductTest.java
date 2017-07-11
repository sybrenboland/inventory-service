package org.shboland.model;

import org.junit.Test;
import org.shboland.model.product.Product;

import static org.junit.Assert.assertNotNull;

public class ProductTest {

    @Test
    public void testConstructor() {

        assertNotNull("Product did not produce object.", new Product());
    }
}
