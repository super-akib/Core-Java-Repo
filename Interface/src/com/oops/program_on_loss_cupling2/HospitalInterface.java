package com.oops.program_on_loss_cupling2;

public interface HospitalInterface 
{
	void admitPatient(String patientName, Address address);
	void provideTreatment(String patientName);
	void generateBill(String patientName, double amount);
}
