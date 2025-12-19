package org.promotionService.repo;

import org.promotionService.enums.Rule;
import org.promotionService.enums.RuleType;
import org.promotionService.model.PromotionDetail;
import org.promotionService.model.PromotionRuleDetailVO;

import java.util.concurrent.ConcurrentHashMap;

public class PromotionRepo {
    public static ConcurrentHashMap<Rule, PromotionRuleDetailVO> promoRuleDB = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, PromotionDetail> promoDB = new ConcurrentHashMap<>();

}
