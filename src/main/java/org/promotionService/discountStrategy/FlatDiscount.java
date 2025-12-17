package org.promotionService.discountStrategy;

import org.promotionService.interfaces.DiscountStrategy;

public class FlatDiscount implements DiscountStrategy {
    @Override
    public void getDiscount(String promocode) {
        System.out.println("getting flat discount");
    }
}
