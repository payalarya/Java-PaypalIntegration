package main.java.com.paypalintegration.utils;

import main.java.com.paypalintegration.Exception.PaymentServiceException;
import main.java.com.paypalintegration.Exception.PaymnetServiceErrorCode;
import main.java.com.paypalintegration.pojos.PaymentRequest;

public class PaymentUtil {

	public static void checkParam(PaymentRequest request) throws PaymentServiceException {

		if (request.getCartId() == null && request.getCartId().isEmpty()) {
			new PaymentServiceException("Required field missing", PaymnetServiceErrorCode.MISSING_CARDID.name());
		} else if (request.getPaymentMethodType() == null && request.getPaymentMethodType().isEmpty()) {
			new PaymentServiceException("Required field missing", PaymnetServiceErrorCode.MISSING_PAYMENTTYPE.name());
		} else if (request.getAmountDue() == null) {
			new PaymentServiceException("Required field missing",
					PaymnetServiceErrorCode.MISSING_PAYMENT_AMOUNT.name());
		}
	}

}
