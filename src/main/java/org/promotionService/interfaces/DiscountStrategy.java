package org.promotionService.interfaces;

public interface DiscountStrategy {
    Double getDiscount(String promocode, Double cartValue, Double discountVal);
}
