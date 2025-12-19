package org.promotionService.model;

import lombok.*;
import org.promotionService.enums.PaymentMode;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromotionValidCart {
	private String promocode;
	private PaymentMode paymentMode;
	private String platform;
	private Integer customerId;
	private Double cartValue;
	private String uuId;
	private List<CartItemForPromoValidation> cartItemList;
}
