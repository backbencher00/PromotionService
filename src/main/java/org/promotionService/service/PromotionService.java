package org.promotionService.service;

import org.promotionService.discountStrategy.LoveDiscount;
import org.promotionService.ruleStrategy.ShreyaRule;
import org.promotionService.ruleTypeStrategy.FreeshippingRuleType;

public class PromotionService {
    public void applyPromo(){
        RuleService ruleService = new RuleService();
        ruleService.setRuleStrategy(new ShreyaRule());
        ruleService.setRuleTypeStrategy(new FreeshippingRuleType());
        ruleService.setDiscountStrategy(new LoveDiscount());
        ruleService.getDiscount("SOURABH_SINGH123");
    }
}
