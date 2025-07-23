package org.example.session16;

public class HospitalDemo {
    public static void main(String[] args) {
        Person staff= new Person("stafName","1");
        Person doctor = new Doctor("docName", "2");
        Person nurse = new Nurse("nurseName", "3");
        Patient patient = new Patient("Marcel", "4", "Cold");

        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();

        InsuranceBilling insuranceBilling = new InsuranceBilling();
        insuranceBilling.generateBill(patient);
    }
}
