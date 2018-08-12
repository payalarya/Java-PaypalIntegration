package main.java.com.paypalintegration.Exception;

public class PaymentServiceException extends Exception {

	String errorKey;

	public PaymentServiceException() {
		super();
	}

	public PaymentServiceException(String message, String errorKey) {
		super(message);
		this.errorKey = errorKey;
	}
}
