package com.helwa.microservices.api.core.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommendationService {

    /**
     * Sample usage: "curl $HOST:$PORT/recommendation?productId=1".
     *
     * @param productId ID of the product
     * @return list of recommendations for the product.
     */
    @GetMapping(
            value = "/recommendation"
            , produces = "application/json"
    )
    List<Recommendation> getRecommendation(@RequestParam(value = "productId") int productId);
}
