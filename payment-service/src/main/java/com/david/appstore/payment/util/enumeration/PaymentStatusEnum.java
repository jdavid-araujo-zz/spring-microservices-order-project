package com.david.appstore.payment.util.enumeration;

public enum PaymentStatusEnum {

	P("Pending"), S("Success"), C("Cancelled"), R("Rejected");

	public String value;

	PaymentStatusEnum(String value) {
		this.value = value;
	}
}
