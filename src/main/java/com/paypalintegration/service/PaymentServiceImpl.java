package main.java.com.paypalintegration.service;

import java.util.logging.Logger;

import main.java.com.paypalintegration.Exception.PaymentServiceException;
import main.java.com.paypalintegration.pojos.PaymentRequest;
import main.java.com.paypalintegration.pojos.PaymentResponse;

public class PaymentServiceImpl implements PaymentService {

	private final static Logger logger = Logger.getLogger(PaymentServiceImpl.class.getName());

	private static PaymentService instance = new PaymentServiceImpl();

	// make singleton
	private PaymentServiceImpl() {

	}

	/*
	 * Gets the single instance of PaymentServiceImpl
	 * 
	 * @return single instance of PaymentServiceImpl
	 */
	public static PaymentService getInstance() {

		return instance;
	}

	public PaymentResponse paymentDue(PaymentRequest request) throws PaymentServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}
