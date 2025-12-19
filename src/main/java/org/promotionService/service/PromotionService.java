package org.promotionService.service;

import org.promotionService.factory.PromotionFactory;
import org.promotionService.strategy.DiscountStrategy;
import org.promotionService.strategy.RuleStrategy;
import org.promotionService.strategy.RuleTypeStrategy;
import org.promotionService.model.PromotionDetail;
import org.promotionService.model.PromotionRuleDetailVO;
import org.promotionService.model.PromotionValidCart;
import org.promotionService.repo.PromotionRepo;
import org.promotionService.request.PromotionRequest;

public class PromotionService {
    private RuleStrategy strategy = null;
    public Double applyPromo(PromotionRequest promotionRequest){
        PromotionDetail promotionDetail = PromotionRepo.promoDB.get(promotionRequest.getPromocode());
        PromotionRuleDetailVO ruleDetailVO = PromotionRepo.promoRuleDB.get(promotionDetail.getRule());
        PromotionValidCart promotionValidCart = buildPromotionValidCart(promotionDetail, ruleDetailVO);
        setRuleStrategy(PromotionFactory.getRuleStrategy(promotionDetail.getRule()));
        setRuleTypeStrategy(PromotionFactory.getRuleTypeStrategy(ruleDetailVO.getRuleType()));
        setRuleTypeStrategy(PromotionFactory.getRuleTypeStrategy(ruleDetailVO.getRuleType()));
        setDiscountStrategy(PromotionFactory.getDiscountStrategy(promotionDetail.getDiscountType()));
        return getDiscount(promotionDetail.getPromocode(), promotionValidCart.getCartValue(), promotionDetail.getDiscountValue());
    }

    private PromotionValidCart buildPromotionValidCart(PromotionDetail promotionDetail, PromotionRuleDetailVO ruleDetailVO) {
        return new PromotionValidCart();
    }

    private void setRuleStrategy(RuleStrategy strategy){
        System.out.println("........................... setting ruleType strategy : " + strategy.getClass().getName());

        this.strategy = strategy;
    }
    private void setRuleTypeStrategy(RuleTypeStrategy strategy){
        System.out.println("........................... setting ruleType strategy : " + strategy.getClass().getName());
        this.strategy.setRuleTypeStrategy(strategy);
    }

    private void setDiscountStrategy(DiscountStrategy strategy){
        System.out.println("............................ setting  discount strategy : " + strategy.getClass().getName());
        this.strategy.getRuleTypeStrategy().setDiscountStrategy(strategy);
    }

    private Double getDiscount(String promo, Double cartValue, Double discountVal){
        System.out.println("............................ getting discount for promo: " + promo);
        return this.strategy.getRuleTypeStrategy().getDiscountDiscountStrategy().getDiscount(promo, cartValue, discountVal);
    }

}
