package com.example.aicodingagent.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountService {

    // Intentional bug for our AI coding agent to discover.
    // Requirement: discount applies only when price >= 1000.
    public BigDecimal calculateDiscount(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) > 0) {
            return price.multiply(new BigDecimal("0.10"));
        }
        return BigDecimal.ZERO;
    }
}
