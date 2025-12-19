package org.promotionService.strategy;

public interface DiscountStrategy {
    Double getDiscount(String promocode, Double cartValue, Double discountVal);
}
