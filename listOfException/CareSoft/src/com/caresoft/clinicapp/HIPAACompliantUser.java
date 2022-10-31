package com.caresoft.clinicapp;

public interface HIPAACompliantUser {

boolean assignPIN(int pinn);
boolean accessAuthorized(Integer acess);
}
