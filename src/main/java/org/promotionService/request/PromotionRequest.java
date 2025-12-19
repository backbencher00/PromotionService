package org.promotionService.request;

import lombok.*;
import org.promotionService.enums.PaymentMode;
import org.promotionService.model.CartItem;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromotionRequest {
	@NonNull
	private String promocode;
	private PaymentMode paymentMode = PaymentMode.ALL ;
	private List<CartItem> cartItemList;
}
