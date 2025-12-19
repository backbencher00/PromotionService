package org.promotionService.discountStrategy;

import org.promotionService.interfaces.DiscountStrategy;

public class FlatDiscount implements DiscountStrategy {
    @Override
    public Double getDiscount(String promocode, Double cartValue, Double discountVal) {
        if(discountVal > cartValue){
            throw new RuntimeException("Invalid promocode : " + promocode);
        }
        return discountVal;
    }
}
