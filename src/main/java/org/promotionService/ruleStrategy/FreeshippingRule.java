package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class FreeshippingRule implements RuleStrategy {

    private  RuleTypeStrategy strategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Invalid strategy for freeshipping rule");
        }
        return strategy;
    }
}
