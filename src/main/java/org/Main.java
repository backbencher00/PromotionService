package org;

import org.promotionService.discountStrategy.FlatDiscount;
import org.promotionService.model.Promotion;
import org.promotionService.request.PromotionRequest;
import org.promotionService.ruleStrategy.DefaultRule;
import org.promotionService.ruleTypeStrategy.FlatRuleType;
import org.promotionService.service.PromotionService;

public class Main {
    public static void main(String[] args) {
        applyPromo();
    }

    public static void applyPromo(){
        PromotionService promotionService = new PromotionService();
        promotionService.applyPromo(PromotionRequest.builder().build());
    }
}