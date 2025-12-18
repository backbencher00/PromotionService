package org;

import org.promotionService.discountStrategy.FreeshippingDiscount;
import org.promotionService.ruleStrategy.CashBackRule;
import org.promotionService.ruleTypeStrategy.FreeshippingRuleType;
import org.promotionService.service.PromotionService;

public class Main {
    public static void main(String[] args) {
        applyPromo();
    }

    public static void applyPromo(){
        PromotionService ruleService = new PromotionService();
        ruleService.setRuleStrategy(new CashBackRule());
        ruleService.setRuleTypeStrategy(new FreeshippingRuleType());
        ruleService.setDiscountStrategy(new FreeshippingDiscount());
        ruleService.getDiscount("SOURABH_SINGH123");
    }
}