package org.promotionService.ruleTypeStrategy;

import org.promotionService.discountStrategy.FlatDiscount;
import org.promotionService.interfaces.DiscountStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class FlatRuleType implements RuleTypeStrategy {
    private DiscountStrategy strategy = null;
    @Override
    public void setDiscountStrategy(DiscountStrategy strategy) {
        if (strategy instanceof FlatDiscount) {
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
