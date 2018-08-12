package main.java.com.paypalintegration.resources;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import main.java.com.paypalintegration.constants.*;
import main.java.com.paypalintegration.delegate.PaymentJerseyDelegate;
import main.java.com.paypalintegration.pojos.PaymentRequest;
import main.java.com.paypalintegration.service.PaymentService;

@Path(PaymentServiceConstants.PAYMENT_CONTEXT_ROOT)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaymentJerseyResource extends AbstractBaseJerseyBase {

	@PathParam("cartId")
	private final static Logger logger = Logger.getLogger(PaymentJerseyResource.class.getName());
	protected PaymentJerseyDelegate paymentDelegate;

	public void postConstruct() {
		paymentDelegate = new PaymentJerseyDelegate();
	}

	public void preDestroy() {
		logger.info("BaseJerseyResource.init : " + this.getClass().getName());
	}

	@PUT
	@Path(PaymentServiceConstants.PAYPAL)
	public Response payment(PaymentRequest request) {
		return paymentDelegate.perFormPayment(request);

	}
}
