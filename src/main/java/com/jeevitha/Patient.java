package com.jeevitha;

public class Patient {

    private int patient_id;
    private String patient_name;
    private int patient_age;
    private String patient_disease;

    public Patient(){

    }

    public Patient(int patient_id,String patient_name, int patient_age, String patient_disease){
        this.patient_id=patient_id;
        this.patient_name=patient_name;
        this.patient_age=patient_age;
        this.patient_disease=patient_disease;
    }

    /* Setters & getters */

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(int patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_disease() {
        return patient_disease;
    }

    public void setPatient_disease(String patient_disease) {
        this.patient_disease = patient_disease;
    }

    public String toString(){
        return patient_id+"\t"+patient_name+"\t"+patient_age+"\t"+patient_disease;
    }
}
