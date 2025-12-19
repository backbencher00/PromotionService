package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;
import org.promotionService.ruleTypeStrategy.*;

public class DefaultRule implements RuleStrategy {
    private  RuleTypeStrategy strategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        if (strategy instanceof FlatRuleType
                || strategy instanceof PercentageRuleType) {
            this.strategy = strategy;
        } else {
            throw new RuntimeException("Invalid rule type strategy for merch rule");
        }
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Invalid strategy for default rule");
        }
        return strategy;
    }
}
