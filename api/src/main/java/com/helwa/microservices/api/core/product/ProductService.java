package com.helwa.microservices.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {

    /**
     * @param productId the ID of the product
     * @return the product if found, else null
     */
    @GetMapping(
            value = "/product/{productId}"
            , produces = "application/json")
    Product getProduct(@PathVariable("productId") int productId);
}
