package com.jeevitha;

import java.util.List;

public interface PatientDAO {
    int insertPatientInfo(Patient patient);
    Patient getPatientByID(int id);
    List<Patient> getAllPatientInfo();
    boolean deletePatient(int id);
    boolean updatePatient(Patient patient);
}
