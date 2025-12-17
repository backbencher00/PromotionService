package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class ShreyaRule implements RuleStrategy {
    private RuleTypeStrategy ruleTypeStrategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        this.ruleTypeStrategy = strategy;
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(ruleTypeStrategy == null){
            throw new RuntimeException("Invalid strategy for freeshipping rule");
        }
         return this.ruleTypeStrategy;
    }
}
