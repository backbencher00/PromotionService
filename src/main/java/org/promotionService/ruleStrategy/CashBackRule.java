package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class CashBackRule implements RuleStrategy {
    private  RuleTypeStrategy strategy = null;
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        if(strategy == null){
            throw new RuntimeException("Inval strategy for cashbackRule");
        }
      return strategy;
    }

}
