package org.promotionService.discountStrategy;

import org.promotionService.interfaces.DiscountStrategy;

public class LoveDiscount implements DiscountStrategy {
    @Override
    public void getDiscount(String promocode) {
        System.out.println("3000X love ");
    }
}
