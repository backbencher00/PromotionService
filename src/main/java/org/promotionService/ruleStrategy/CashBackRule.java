package org.promotionService.ruleStrategy;

import org.promotionService.strategy.RuleStrategy;
import org.promotionService.strategy.RuleTypeStrategy;
import org.promotionService.ruleTypeStrategy.*;

public class CashBackRule implements RuleStrategy {
    private  RuleTypeStrategy strategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        if (strategy instanceof FlatRuleType
                || strategy instanceof PercentageRuleType
                || strategy instanceof FreeshippingRule) {
            this.strategy = strategy;
        } else {
            throw new RuntimeException("Invalid rule type strategy for merch rule");
        }
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Inval strategy for cashbackRule");
        }
      return strategy;
    }

}
