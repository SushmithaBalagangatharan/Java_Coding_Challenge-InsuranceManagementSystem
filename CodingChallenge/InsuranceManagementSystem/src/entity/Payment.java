package entity;

public class Payment {
	private int paymentId;
	private double paymentAmount;
	private int clientId;
	
	public int getPaymentId() {
		return paymentId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public int getClientId() {
		return clientId;
	}
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String toString() {
		return "Payment: [ paymentId="+ paymentId +", paymentAmount="+ paymentAmount + ", clientId="+ clientId + "]";
	}
}
