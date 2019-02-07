package com.jeevitha;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {

    public Patient mapRow(ResultSet resultSet, int i) throws SQLException {
        Patient patient=new Patient();
        patient.setPatient_id(resultSet.getInt("patient_id"));
        patient.setPatient_name(resultSet.getString("patient_name"));
        patient.setPatient_age(resultSet.getInt("patient_age"));
        patient.setPatient_disease(resultSet.getString("patient_disease"));
        return patient;
    }
}
