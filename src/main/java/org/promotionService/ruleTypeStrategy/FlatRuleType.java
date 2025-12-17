package org.promotionService.ruleTypeStrategy;

import org.promotionService.interfaces.DiscountStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class FlatRuleType implements RuleTypeStrategy {
    private DiscountStrategy discountStrategy = null;
    @Override
    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    @Override
    public DiscountStrategy getDiscountDiscountStrategy() {
        return discountStrategy;
    }
}
