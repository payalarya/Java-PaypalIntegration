package main.java.com.paypalintegration.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;


import main.java.com.paypalintegration.constants.PaymentServiceConstants;;

@Path(PaymentServiceConstants.PAYMENT_CONTEXT_ROOT)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaymentJerseyResource extends BaseJerseyResource {

	public PaymentJerseyResource(UriInfo uriInfo) {
		super(uriInfo);
		// TODO Auto-generated constructor stub
	}

	

}
