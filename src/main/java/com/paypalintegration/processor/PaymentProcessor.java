package main.java.com.paypalintegration.processor;

import main.java.com.paypalintegration.Exception.PaymentServiceException;
import main.java.com.paypalintegration.pojos.PaymentRequest;
import main.java.com.paypalintegration.pojos.PaymentResponse;
import main.java.com.paypalintegration.service.PaymentService;
import main.java.com.paypalintegration.service.PaymentServiceImpl;

public class PaymentProcessor {

	public static PaymentResponse paymentDue(PaymentRequest request) throws PaymentServiceException {
		PaymentResponse response = null;
		PaymentService paymentService = PaymentServiceImpl.getInstance();
		response = paymentService.paymentDue(request);
		return response;
	}

}
