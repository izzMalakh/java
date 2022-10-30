package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser{

	

public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	@Override
	public boolean assignPIN(int pinn) {
		if(pinn<4) {
		return false;
		}
		else {
			
			setPin(pinn);
			return true;
		}
	}

	@Override
	public boolean accessAuthorized(Integer access) {
		if(access==getId()) {
			return true;
			}
			else {
				
				return false;
			}
	}
	  // TO DO: Setters & Getters


	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


	
  
}
