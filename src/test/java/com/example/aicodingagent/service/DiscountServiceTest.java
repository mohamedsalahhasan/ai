package com.example.aicodingagent.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountServiceTest {

    @Test
    void shouldReturnZeroWhenPriceIsBelowDiscountThreshold() {
        DiscountService service = new DiscountService();

        assertEquals(
                new BigDecimal("0.00"),
                service.calculateDiscount(new BigDecimal("500"))
        );
    }
}
