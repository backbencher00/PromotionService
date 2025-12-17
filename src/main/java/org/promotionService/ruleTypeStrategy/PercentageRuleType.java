package org.promotionService.ruleTypeStrategy;

import org.promotionService.interfaces.DiscountStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class PercentageRuleType implements RuleTypeStrategy {
    private DiscountStrategy strategy = null;
    @Override
    public void setDiscountStrategy(DiscountStrategy strategy) {
        System.out.println("setting percenage discount strategy");
        this.strategy = strategy;
    }

    @Override
    public DiscountStrategy getDiscountDiscountStrategy() {
        return strategy;
    }
}
