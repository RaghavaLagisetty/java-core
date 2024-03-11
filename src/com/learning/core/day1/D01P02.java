package com.learning.core.day1;


public class D01P02 {
public static void main(String[] args) {
	D01P02MedicineInfo tablet=new D01P02Tablet();
	D01P02MedicineInfo syrup=new D01P02Syrup();
	D01P02MedicineInfo ointment=new D01P02Ointment();
	
	tablet.displayLabel();
	syrup.displayLabel();
	ointment.displayLabel();
}
}
