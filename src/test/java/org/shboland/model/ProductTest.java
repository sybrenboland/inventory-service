package org.shboland.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProductTest {

    @Test
    public void testConstructor() {

        assertNotNull("Product did not produce object.", new Product());
    }
}
