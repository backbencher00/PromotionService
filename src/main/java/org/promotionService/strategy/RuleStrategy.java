package org.promotionService.strategy;

public interface RuleStrategy {
    void setRuleTypeStrategy(RuleTypeStrategy strategy);
    RuleTypeStrategy getRuleTypeStrategy();
}
