package org.promotionService.factory;

import org.promotionService.discountStrategy.FlatDiscount;
import org.promotionService.discountStrategy.PercentageDiscount;
import org.promotionService.enums.DiscountType;
import org.promotionService.enums.Rule;
import org.promotionService.enums.RuleType;
import org.promotionService.ruleStrategy.CashBackRule;
import org.promotionService.ruleStrategy.DefaultRule;
import org.promotionService.ruleStrategy.FreeshippingRule;
import org.promotionService.ruleStrategy.MerchRule;
import org.promotionService.ruleTypeStrategy.*;
import org.promotionService.strategy.DiscountStrategy;
import org.promotionService.strategy.RuleStrategy;
import org.promotionService.strategy.RuleTypeStrategy;

public class PromotionFactory {
    public static RuleStrategy getRuleStrategy(Rule rule){
        if(Rule.DEFAULT.equals(rule)){
            return new DefaultRule();
        }else if(Rule.MERCH.equals(rule)){
            return  new MerchRule();
        }else if(Rule.CASHBACK.equals(rule)){
            return  new CashBackRule();
        }else if(Rule.FREESHIPPING.equals(rule)){
            return  new FreeshippingRule();
        }else {
            throw new RuntimeException("Invalid rule type");
        }
    }

    public static RuleTypeStrategy getRuleTypeStrategy(RuleType ruletype){
        if(RuleType.FLAT.equals(ruletype)){
            return new FlatRuleType();
        }else if(RuleType.PERCENTAGE.equals(ruletype)){
            return  new PercentageRuleType();
        }else if(RuleType.BOGO.equals(ruletype)){
            return  new BogoRuleType();
        }else if(RuleType.PLP.equals(ruletype)){
            return  new PlpRuleType();
        }else if(RuleType.FREESHIPPING.equals(ruletype)){
            return  new FreeshippingRuleType();
        }else if(RuleType.PRODUCTS.equals(ruletype)){
            return  new ProductRuleType();
        }else {
            throw new RuntimeException("Invalid rule type");
        }
    }

    public static DiscountStrategy getDiscountStrategy(DiscountType discountType){
        if(DiscountType.FLAT.equals(discountType)){
            return new FlatDiscount();
        }else if(DiscountType.PERCENTAGE.equals(discountType)){
            return new PercentageDiscount();
        }else {
            throw new RuntimeException("Invalid rule type");
        }
    }

}
