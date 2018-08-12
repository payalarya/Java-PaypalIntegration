package main.java.com.paypalintegration.delegate;

import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import main.java.com.paypalintegration.Exception.PaymentServiceException;
import main.java.com.paypalintegration.pojos.PaymentRequest;
import main.java.com.paypalintegration.pojos.PaymentResponse;
import main.java.com.paypalintegration.processor.PaymentProcessor;
import main.java.com.paypalintegration.utils.PaymentUtil;

public class PaymentJerseyDelegate {
	private final static Logger logger = Logger.getLogger(PaymentJerseyDelegate.class.getName());

	public Response perFormPayment(PaymentRequest request) {
		PaymentResponse response = null;
		try {

			PaymentUtil.checkParam(request);
			response = PaymentProcessor.paymentDue(request);

		} catch (PaymentServiceException e) {
			response = new PaymentResponse();
			// logger.error("Exception Occured while processing the request");
			response.setError(e.getMessage());
		}
		return generateSuccessFullResponse(response);
	}

	private Response generateSuccessFullResponse(Object entity) {
		return Response.ok(entity).build();
	}

}
