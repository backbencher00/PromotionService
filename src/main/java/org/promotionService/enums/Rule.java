package org.promotionService.enums;

public enum Rule {
	
DEFAULT("DEFAULT"),MERCH("MERCH"), CASHBACK("CASHBACK"), FREESHIPPING("FREESHIPPING");
	private String value;

	private Rule(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
