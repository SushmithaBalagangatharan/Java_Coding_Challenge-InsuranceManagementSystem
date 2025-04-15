package main;

import java.util.List;
import java.util.Scanner;

import dao.InsuranceServiceImpl;
import entity.Policy;
import exception.PolicyNotFoundException;

public class MainModule {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("\n------------ Insurance Policy Management ------------");
			System.out.println("1. Create Policy");
			System.out.println("2. Get Policy");
			System.out.println("3. List All Policies");
			System.out.println("4. Update Policy");
			System.out.println("5. Delete Policy");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();
			sc.nextLine();
			boolean status = false;
			
			InsuranceServiceImpl isp = new InsuranceServiceImpl();
			
			try {
				switch(choice) {
				
//					create policy
					case 1:
						System.out.println("Enter Policy Name: ");
						String policyName = sc.nextLine();
						System.out.println("Enter Coverage Type: ");
						String coverageType = sc.nextLine();
						System.out.println("Enter the Premium Amount: ");
						double premium = sc.nextDouble();
						
						Policy policy = new Policy(0, policyName, coverageType, premium);
						
						status = isp.createPolicy(policy);
						
						if(status) {
							System.out.println("Policy created successfully!");
						}
						else {
							System.out.println("Policy Creation Failed!");
						}
						break;

//					get Policy
					case 2:
						 System.out.println("Enter Policy ID: ");
						 int policyId = sc.nextInt();
						 
						 Policy policy1 = isp.getPolicy(policyId);
						 
						 System.out.println(policy1.getPolicyName());
						 System.out.println(policy1.getCoverageType());
						 System.out.println(policy1.getPremiumAmount());
						 break;
						 
//					getAllPolicies
					case 3:
						List<Policy> policies = isp.getAllPolicies();
						
						for(Policy p : policies) {
							System.out.println(p.getPolicyId());
							System.out.println(p.getPolicyName());
							System.out.println(p.getCoverageType());
							System.out.println(p.getPremiumAmount()+"\n");
						}
						break;
						
//					updatePolicy
					case 4:
						System.out.println("Enter Policy ID: ");
						int policyId2 = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Policy Name: ");
						String policyName2 = sc.nextLine();
						System.out.println("Enter Coverage Type: ");
						String coverageType2 = sc.nextLine();
						System.out.println("Enter the Premium Amount: ");
						double premium2 = sc.nextDouble();
						
						Policy policy2 = new Policy(policyId2, policyName2, coverageType2, premium2);
						
						status = isp.updatePolicy(policy2);
						
						if(status) {
							System.out.println("Policy Updated Sucessfully!");
						}
						else {
							System.out.println("Policy Updation Failed!");
						}
						break;
						
//					deletePolicy
					case 5:
						System.out.println("Enter policy ID: ");
						int policyId3 = sc.nextInt();
						
						status = isp.deletePolicy(policyId3);
						
						if(status) {
							System.out.println("Policy Deleted Sucessfully!");
						}
						else {
							System.out.println("Policy Deletion Failed!");
						}
						break;
						
					case 6:
						System.out.println("Exiting...");
						break;
				}		
			}
			catch(PolicyNotFoundException p) {
				System.out.println(p.getMessage());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}while(choice!=6);
	}

}
