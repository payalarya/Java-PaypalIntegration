package main.java.com.paypalintegration.resources;

import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractJerseyBase {
	
	@Context
	protected HttpServletRequest httpServletRequest;
	
	@Context
	protected HttpServletResponse httpServletResponse;
	
	protected String getHttpHeader(String name) {
		return httpServletRequest.getHeader(name);
	}
	
	protected void setResposneHeader(String name, String value) {
		httpServletResponse.setHeader(name, value);
	}
	
	protected void setResponseHeader(String name, String value) {
		httpServletResponse.setHeader(name, value);
	}
	
	protected void setHeader(String name, String value) {
		setResponseHeader(name, value);
	}
}
