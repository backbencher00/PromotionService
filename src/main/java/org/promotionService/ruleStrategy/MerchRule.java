package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;
import org.promotionService.ruleTypeStrategy.BogoRuleType;
import org.promotionService.ruleTypeStrategy.PlpRuleType;
import org.promotionService.ruleTypeStrategy.ProductRuleType;

public class MerchRule implements RuleStrategy {
    private  RuleTypeStrategy strategy = null;

    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        if (strategy instanceof BogoRuleType
                || strategy instanceof PlpRuleType
                || strategy instanceof ProductRuleType) {

            this.strategy = strategy;
        } else {
            throw new RuntimeException("Invalid rule type strategy for merch rule");
        }
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Invalid rule type strategy for merch rule");
        }
        return strategy;
    }
}
