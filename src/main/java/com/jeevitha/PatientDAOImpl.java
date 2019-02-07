package com.jeevitha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class PatientDAOImpl implements PatientDAO {

    JdbcTemplate jdbcTemplate;

    private String insertQry="insert into patient(patient_id,patient_name,patient_age,patient_disease)values (?,?,?,?)";
    private String getPatientQry="select * from patient where patient_id=?";
    private String getAllPatientqry="select * from patient";
    private String deletePatient="delete from patient where patient_id=?";
    private String updateQry="update patient set patient_disease=? where patient_id=?";

    @Autowired
    PatientDAOImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public int insertPatientInfo(Patient patient) {
        return jdbcTemplate.update(insertQry, new Object[]{patient.getPatient_id(), patient.getPatient_name(), patient.getPatient_age(), patient.getPatient_disease()});

    }

    @Override
    public Patient getPatientByID(int id){
        return jdbcTemplate.queryForObject(getPatientQry, new Object[]{id}, new PatientMapper());

    }

    @Override
    public List<Patient> getAllPatientInfo() {
        return jdbcTemplate.query(getAllPatientqry,new PatientMapper());
    }

    @Override
    public boolean deletePatient(int id) {
        return jdbcTemplate.update(deletePatient, new Object[]{id})>0;
    }

    @Override
    public boolean updatePatient(Patient patient) {
        return jdbcTemplate.update(updateQry, new Object[]{patient.getPatient_disease(), patient.getPatient_id()})>0;
    }
}
