package org.promotionService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemForPromoValidation {
	
	private String sku;
	private Integer quantity;
	private Double retailPrice;
	private String category;
	private String subCategory;
	private String productType;
	private Integer productId;
	private long plpId;
	
	@Override
	public int hashCode() {
	    int hash = 7;
	    hash = 31 * hash + (sku == null ? 0 : sku.hashCode());
	    hash = 31 * hash + quantity;
	    hash = (int) (31 * hash + retailPrice);
	    hash = 31 * hash + (category == null ? 0 : category.hashCode());
	    hash = 31 * hash + (subCategory==null? 0 : subCategory.hashCode());
	    hash = 31 * hash + (productType==null? 0 : productType.hashCode()); 
	    hash = 31 * hash + (productId == null ? 0 : category.hashCode());
	    hash = (int) (31 * hash + plpId);
	    return hash;
	}
	
	 @Override
	    public boolean equals(Object object) {
	        if (this == object) return true;
	        if (object == null) return false;
	        if (this.getClass() != object.getClass()) return false;
	        CartItemForPromoValidation  cartItemObj = (CartItemForPromoValidation) object;
	        return sku.equals(cartItemObj.sku)
	          &&  quantity == cartItemObj.quantity
	          && retailPrice == cartItemObj.retailPrice
	          && category.equals(cartItemObj.category)
	          && subCategory.equals(cartItemObj.subCategory)
	          && productType.equals(cartItemObj.productType)
	          && productId==cartItemObj.productId
	          && plpId==cartItemObj.plpId;
	    }	
}
