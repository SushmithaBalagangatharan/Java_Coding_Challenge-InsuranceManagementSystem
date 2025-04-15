package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.Policy;
import exception.PolicyNotFoundException;
import util.DBConnection;

public class InsuranceServiceImpl implements IPolicyService {

	@Override
	public boolean createPolicy(Policy policy) {
		try {
			String query = "insert into Policy (policyName, coverageType, premiumAmount) values (?,?,?);";
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, policy.getPolicyName());
			pst.setString(2, policy.getCoverageType());
			pst.setDouble(3, policy.getPremiumAmount());
			
			int row_num = pst.executeUpdate();
			
			return row_num>0;
		}
		catch(SQLException e) {
			System.out.println(e.toString());
			return false;
		}
	}

	@Override
	public Policy getPolicy(int policyId) throws PolicyNotFoundException {
		try {
			String query = "select * from Policy where policyId = ?";
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, policyId);
			
			ResultSet rs = pst.executeQuery();
			
			Policy policy = null;
			
			while(rs.next()) {
				String policyName = rs.getString(2);
				String coverageType = rs.getString(3);
				double premium = rs.getDouble(4);
				policy = new Policy(policyId, policyName, coverageType, premium);
			}
			
			if(policy == null) {
				throw new PolicyNotFoundException();
			}
			return policy;
		}
		catch(SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}

	@Override
	public List<Policy> getAllPolicies() throws PolicyNotFoundException{
		try {
			String query = "select * from Policy";
			
			Connection con = DBConnection.getConnection();
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			List<Policy> policyList = new ArrayList<>();
			
			while(rs.next()) {
				int policyId = rs.getInt(1);
				String policyName = rs.getString(2);
				String coverageType = rs.getString(3);
				double premium = rs.getDouble(4);
				
				Policy policy = new Policy(policyId, policyName, coverageType, premium);
				policyList.add(policy);
			}
			
			if(policyList.isEmpty()) {
				throw new PolicyNotFoundException("No policies found in the databases.");
			}
			
			return policyList;
		}
		catch(SQLException e) {
			System.out.println(e.toString());
			return null;
		}
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		try {
			String query = "update Policy set policyName = ?, coverageType = ?, premiumAmount = ? where policyId = ?";
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, policy.getPolicyName());
			pst.setString(2, policy.getCoverageType());
			pst.setDouble(3, policy.getPremiumAmount());
			pst.setInt(4, policy.getPolicyId());
			
			int row_num = pst.executeUpdate();
			
			return row_num > 0;
			
		}
		catch(SQLException e) {
			System.out.println(e.toString());
			return false;
		}
	}

	@Override
	public boolean deletePolicy(int policyId) throws PolicyNotFoundException{
		try {
			String query = "delete from Policy where policyId = ?";
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1, policyId);
			
			int row_num = pst.executeUpdate();
			
			if(row_num == 0) {
				throw new PolicyNotFoundException();
			}
			
			return row_num>0;
		}
		catch(SQLException e) {
			System.out.println(e.toString());
			return false;
		}
	}

}
