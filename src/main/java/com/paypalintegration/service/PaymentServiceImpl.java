package main.java.com.paypalintegration.service;

import java.util.logging.Logger;


public class PaymentServiceImpl implements PaymentService{
	
	private final static Logger logger = Logger.getLogger(PaymentServiceImpl.class.getName());

	private static PaymentService instance = new PaymentServiceImpl();
	
	//make singleton
	private PaymentServiceImpl() {
		
	}
	/*
	 * Gets the single instance of PaymentServiceImpl
	 * @return single instance of PaymentServiceImpl
	 */
	public static PaymentService getInstance() {
		
		return instance;
	}
}
