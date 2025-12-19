package org.promotionService.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
	@NonNull
    private String sku;
	private long plpId;
	@NonNull
	private Integer quantity;

}