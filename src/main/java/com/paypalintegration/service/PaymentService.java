package main.java.com.paypalintegration.service;

import main.java.com.paypalintegration.Exception.PaymentServiceException;
import main.java.com.paypalintegration.pojos.PaymentRequest;
import main.java.com.paypalintegration.pojos.PaymentResponse;

public interface PaymentService {

	public PaymentResponse paymentDue(PaymentRequest request) throws PaymentServiceException;

}
