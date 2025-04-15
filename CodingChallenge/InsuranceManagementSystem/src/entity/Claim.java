package entity;

public class Claim {
	
	private int claimId;
	private int claimNumber;
	private double claimAmount;
	private String claimStatus;
	private int policyId;
	private int clientId;
	
	public Claim() {
		
	}
	
	public Claim(int claimId, int claimNumber, double claimAmount, String claimStatus, int policyId, int clientId) {
		this.claimId = claimId;
		this.claimNumber = claimNumber;
		this.claimAmount = claimAmount;
		this.claimStatus = claimStatus;
		this.policyId = policyId;
		this.clientId = clientId;
	}
	
	public int getClaimId() {
		return this.claimId;
	}
	
	public int getClaimNumber() {
		return this.claimNumber;
	}
	
	public double getClaimAmount() {
		return this.claimAmount;
	}
	
	public String getClaimStatus() {
		return this.claimStatus;
	}
	
	public int getPolicyId() { 
		return this.policyId;
	}
	
	public int getClientId() {
		return this.clientId;
	}
	
	
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	
	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber; 
	}
	
	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}
	
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	public void setClaimPolicy(int policyId) { 
		this.policyId = policyId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String toString() {
		return "Claim [claimId="+ claimId + ", claimNumber="+ claimNumber + ", claimAmount="+ 
				claimAmount +", claimStatus="+ claimStatus + ", policyId="+ policyId + ", clientId="+ clientId + " ]";
	}
	
}
