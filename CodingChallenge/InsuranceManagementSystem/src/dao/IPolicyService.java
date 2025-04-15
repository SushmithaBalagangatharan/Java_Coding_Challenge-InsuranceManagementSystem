package dao;

import java.util.List;
import entity.Policy;
import exception.PolicyNotFoundException;

public interface IPolicyService {
	boolean createPolicy(Policy policy);
	Policy getPolicy(int policyId) throws PolicyNotFoundException;
	List<Policy> getAllPolicies() throws PolicyNotFoundException;
	boolean updatePolicy(Policy policy);
	boolean deletePolicy(int policyId) throws PolicyNotFoundException;
}
