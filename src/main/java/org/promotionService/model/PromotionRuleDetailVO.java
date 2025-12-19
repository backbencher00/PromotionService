package org.promotionService.model;


import lombok.*;
import org.promotionService.enums.RuleType;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PromotionRuleDetailVO{

	private RuleType ruleType;
	private String category;
	private String subCategory;
	private String productType;
	private String uniquerIdentifier;
	private Integer plpId;
	private Integer parentRuleId;
	Boolean isBuyGetSame = false;


}
