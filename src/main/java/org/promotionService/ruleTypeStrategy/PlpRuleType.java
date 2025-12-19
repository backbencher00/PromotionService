package org.promotionService.ruleTypeStrategy;

import org.promotionService.discountStrategy.FlatDiscount;
import org.promotionService.discountStrategy.PercentageDiscount;
import org.promotionService.strategy.DiscountStrategy;
import org.promotionService.strategy.RuleTypeStrategy;

public class PlpRuleType implements RuleTypeStrategy {
    private DiscountStrategy strategy = null;
    @Override
    public void setDiscountStrategy(DiscountStrategy strategy) {
        if (strategy instanceof FlatDiscount || strategy instanceof PercentageDiscount) {
            this.strategy = strategy;
        } else {
            throw new RuntimeException("Invalid rule type strategy for merch rule");
        }
    }

    @Override
    public DiscountStrategy getDiscountDiscountStrategy() {
        if(strategy == null){
            throw new RuntimeException("Inval strategy for cashbackRule");
        }
        return strategy;
    }
}
