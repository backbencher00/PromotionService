package org.promotionService.ruleTypeStrategy;

import org.promotionService.interfaces.DiscountStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class FreeshippingRuleType implements RuleTypeStrategy {
    private DiscountStrategy strategy = null;
    @Override
    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public DiscountStrategy getDiscountDiscountStrategy() {
        return strategy;
    }
}
