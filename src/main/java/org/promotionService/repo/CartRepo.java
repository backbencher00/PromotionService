package org.promotionService.repo;

import org.promotionService.model.CartItem;

import java.util.concurrent.ConcurrentHashMap;

public class CartRepo {
    ConcurrentHashMap<String, CartItem> cartDb = new ConcurrentHashMap<>();
}
