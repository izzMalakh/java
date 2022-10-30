package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{
	

    

    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer idd, String rolee) {
		super(idd);
		this.id=idd;
		this.role=getRole();
		// TODO Auto-generated constructor stub
	}
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters


	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return securityIncidents;
	}

	@Override
	public boolean assignPIN(int pinn) {
		if(pinn<6) {
			
			return false;
		}
		else {
			setPin(pinn);
			
			return true;
		}
		
	}

	@Override
	public boolean accessAuthorized(Integer acess) {
		if(acess== getId()) {
			
			return true;
		}
		else {
			authIncident();
			return false;
		}
		
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
