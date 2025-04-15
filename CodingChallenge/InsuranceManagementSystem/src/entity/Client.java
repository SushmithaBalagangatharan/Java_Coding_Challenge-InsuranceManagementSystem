package entity;

public class Client {

	private int clientId;
	private String clientName;
	private String contactInfo;
	private int policyId;
	
	public Client() {
		
	}
	
	public Client(int clientId, String clientName, String contactInfo, int policyId) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.contactInfo = contactInfo;
		this.policyId = policyId;
	}
	
	public int getClientId() {
		return this.clientId;
	}
	
	public String getClientName() {
		return this.clientName;
	}
	
	public String getContactInfo() {
		return this.contactInfo;
	}
	
	public int getPolicyId() {
		return this.policyId;
	}
	

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public void setPolicy(int policyId) {
		this.policyId = policyId;
	}
	
	public String toString() {
		return "Client: [ clientI="+ clientId +", clientName="+ clientName +", contactInfo="+ contactInfo 
				+", policyId="+policyId+" ]";
	}
}
