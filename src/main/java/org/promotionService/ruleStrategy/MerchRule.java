package org.promotionService.ruleStrategy;

import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class MerchRule implements RuleStrategy {
    @Override
    public void setRuleTypeStrategy(RuleTypeStrategy strategy) {

    }

    @Override
    public RuleTypeStrategy getRuleTypeStrategy() {
        return null;
    }
}
