package com.example.aicodingagent.controller;

import com.example.aicodingagent.service.DiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount")
    public BigDecimal discount(@RequestParam BigDecimal price) {
        return discountService.calculateDiscount(price);
    }
}
