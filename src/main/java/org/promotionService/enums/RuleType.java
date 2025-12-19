package org.promotionService.enums;

public enum RuleType {

	PERCENTAGE("PERCENTAGE"), FLAT("FLAT"), PRODUCTS("PRODUCTS"), FREESHIPPING("FREESHIPPING"),  PLP("PLP"), BOGO("BOGO"),Others("others");

	private String value = null;

	private RuleType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
