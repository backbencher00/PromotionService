package org.promotionService.model;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.promotionService.enums.DiscountType;
import org.promotionService.enums.PaymentMode;
import org.promotionService.enums.Platform;
import org.promotionService.enums.Rule;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDetail {

	private Integer promotionId ;
	private String promocode ;
	private Date endDate ;
 	private boolean oncePerCustomer ;
	private DiscountType discountType ;
    private Double DiscountValue;
	private Double DiscountUpto ;
	private Double minimumCartValue ;
	private Double availableAmount;
	private Platform platfrom ;
	private PaymentMode paymentMode;
	private Rule rule;
 
}
