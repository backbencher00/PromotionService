package org.promotionService.strategy;

public interface RuleTypeStrategy {
    void setDiscountStrategy(DiscountStrategy strategy);
    DiscountStrategy getDiscountDiscountStrategy();
}
