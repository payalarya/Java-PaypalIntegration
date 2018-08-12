package main.java.com.paypalintegration.Exception;

public enum PaymnetServiceErrorCode {

	MISSING_CARDID("MISSING_CARTID"), MISSING_PAYMENTTYPE("MISSING_PAYMENTTYPE"), MISSING_PAYMENT_AMOUNT(
			"MISSING_PAYMENT_AMOUNT"), DEFAUTL_ERROR("DEFAUTL_ERROR");

	private final String errorKey;

	private PaymnetServiceErrorCode(String errorKey) {
		this.errorKey = errorKey;
	}

	public String getErrorKey() {
		return errorKey;
	}
}
