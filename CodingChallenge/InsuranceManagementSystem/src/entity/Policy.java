package entity;

public class Policy {
	private int policyId;
	private String policyName;
	private String coverageType;
	private double premiumAmount;
	
	public Policy() {
		
	}
	
	public Policy(int policyId, String policyName, String coverageType, double premiumAmount) {
		this.policyId = policyId;
		this.policyName = policyName;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}
	
	public int getPolicyId() {
		return policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	public String toString() {
		return "Policy: [ policyId="+ policyId +", policyName="+ policyName +  ", coverageType=" + coverageType+
			   ", premiumAmount="+ premiumAmount+ " ]";
	}
}
