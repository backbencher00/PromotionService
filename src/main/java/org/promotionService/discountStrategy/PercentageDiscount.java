package org.promotionService.discountStrategy;

import org.promotionService.strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    @Override
    public Double getDiscount(String promocode, Double cartValue, Double discountVal) {
        Double totalIllibleDiscount = (cartValue*discountVal)/100;
        if(totalIllibleDiscount > cartValue){
            throw new RuntimeException("Invalid promocode : " + promocode);
        }
        return totalIllibleDiscount;
    }
}
