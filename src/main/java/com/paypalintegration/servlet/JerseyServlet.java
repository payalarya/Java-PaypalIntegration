package main.java.com.paypalintegration.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jersey.spi.container.WebApplication;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.sun.jersey.api.core.ResourceConfig;

public class JerseyServlet extends ServletContainer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void configure(ServletConfig servletConfig, ResourceConfig rc, WebApplication wa) {
		super.configure(servletConfig, rc, wa);
		rc.getFeatures().put(ResourceConfig.FEATURE_DISABLE_WADL, true);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {

	}

}
