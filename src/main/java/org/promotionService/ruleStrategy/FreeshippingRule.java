package org.promotionService.ruleStrategy;

import org.promotionService.strategy.RuleStrategy;
import org.promotionService.strategy.RuleTypeStrategy;
import org.promotionService.ruleTypeStrategy.FreeshippingRuleType;

public class FreeshippingRule implements RuleStrategy {

    private  RuleTypeStrategy strategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        if (strategy instanceof FreeshippingRuleType) {
            this.strategy = strategy;
        } else {
            throw new RuntimeException("Invalid rule type strategy for freeshipping rule");
        }
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Invalid strategy for freeshipping rule");
        }
        return strategy;
    }
}
