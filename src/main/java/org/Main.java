package org;

import org.promotionService.service.PromotionService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PromotionService service = new PromotionService();
        service.applyPromo();
    }
}