package org.promotionService.service;

import org.promotionService.interfaces.DiscountStrategy;
import org.promotionService.interfaces.RuleStrategy;
import org.promotionService.interfaces.RuleTypeStrategy;

public class PromotionService {
    RuleStrategy strategy = null;

    public void setRuleStrategy(RuleStrategy strategy){
        System.out.println("setting rule strategy : " + strategy.getClass().getName());
        this.strategy = strategy;
    }
    public void setRuleTypeStrategy(RuleTypeStrategy strategy){
        System.out.println("setting ruleType strategy : " + strategy.getClass().getName());
        this.strategy.setRuleTypeStrategy(strategy);
    }

    public void setDiscountStrategy(DiscountStrategy strategy){
        System.out.println("setting  discount strategy : " + strategy.getClass().getName());
        this.strategy.getRuleTypeStrategy().setDiscountStrategy(strategy);
    }

    public void getDiscount(String promocode){
        System.out.println("getting discount for promo : " + promocode);
        this.strategy.getRuleTypeStrategy().getDiscountDiscountStrategy().getDiscount(promocode);
    }

}
