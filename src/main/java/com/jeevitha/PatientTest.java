package com.jeevitha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PatientTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PatientDAO patientDAO = context.getBean(PatientDAO.class);

        System.out.println("List of patients is:");

        for (Patient p : patientDAO.getAllPatientInfo()) {
            System.out.println(p.getPatient_id()+"\t"+p.getPatient_name()+"\t"+p.getPatient_disease()+"\t"+p.getPatient_age());
        }

        System.out.println("\nGet patient with ID 2");

        Patient patientById = patientDAO.getPatientByID(2);
        System.out.println(patientById);

        System.out.println("\nCreating person: ");
        Patient patient = new Patient(4, "Bharani", 30, "Bi-polar");
        System.out.println(patient);
        patientDAO.insertPatientInfo(patient);
        System.out.println("\nList of patients is:");

        for (Patient p : patientDAO.getAllPatientInfo()) {
            System.out.println(p);
        }

        System.out.println("\nDeleting person with ID 2");
        patientDAO.deletePatient(2);

        System.out.println("\nUpdate person with ID 3");

        Patient patient1 = patientDAO.getPatientByID(3);
        patient1.setPatient_disease("Sinus");
        patientDAO.updatePatient(patient1);

        System.out.println("\nList of person is:");
        for (Patient p : patientDAO.getAllPatientInfo()) {
            System.out.println(p);
        }

        context.close();
    }
}
