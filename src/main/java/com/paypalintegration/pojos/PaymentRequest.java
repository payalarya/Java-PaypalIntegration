package main.java.com.paypalintegration.pojos;

import java.math.BigDecimal;

public class PaymentRequest {

	String cartId;
	String paymentMethodType;
	BigDecimal amountDue;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public BigDecimal getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}

}
