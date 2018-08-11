package main.java.com.paypalintegration.resources;

import java.util.logging.Logger;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import main.java.com.paypalintegration.service.PaymentService;
import main.java.com.paypalintegration.service.PaymentServiceImpl;

public class BaseJerseyResource extends AbstractJerseyBase {
	
	private final static Logger logger = Logger.getLogger(BaseJerseyResource.class.getName());
	protected PaymentService paymentService;
	
	public BaseJerseyResource(@Context UriInfo uriInfo){
		paymentService = PaymentServiceImpl.getInstance();
	}
	
	public void postConstruct() {
		init();
	}

	public void init() {
	}
	
	public void preDestroy() {
		logger.info("BaseJerseyResource.init : " + this.getClass().getName());
	}
	
}
