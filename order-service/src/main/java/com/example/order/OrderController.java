package com.example.order;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${product.service.url:http://localhost:8081}")
    private String productServiceUrl;

    @GetMapping("/orders/{id}")
    public Map<String, Object> getOrder(@PathVariable int id) {
        String productResponse = restTemplate.getForObject(
            productServiceUrl + "/products/1",
            String.class
        );

        return Map.of(
            "orderId", id,
            "status", "CREATED",
            "product", productResponse
        );
    }
}
