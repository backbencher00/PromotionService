package org.promotionService.interfaces;

public interface RuleStrategy {
    void setRuleTypeStrategy(RuleTypeStrategy strategy);
    RuleTypeStrategy getRuleTypeStrategy();
}
