package com.example.patientmgmtsystem.services;

import com.example.patientmgmtsystem.dtos.CreatePatientRequestDto;
import com.example.patientmgmtsystem.models.Patient;
import com.example.patientmgmtsystem.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(CreatePatientRequestDto requestDto) {

        Patient patient = new Patient();
        patient.setName(requestDto.getName());
        patient.setEmail(requestDto.getEmail());
        patient.setContactNumber(requestDto.getContactNumber());
        patient.setBloodGroup(requestDto.getBloodGroup());
        patient.setAddress(requestDto.getAddress());
        patient.setBirthDate(requestDto.getBirthDate());
        patient.setRegistrationNumber(requestDto.getRegistrationNumber());

        // validations

        // save patient details
        return patientRepository.save(patient);
    }
}
