package com.example.patientmgmtsystem;

import com.example.patientmgmtsystem.controllers.PatientController;
import com.example.patientmgmtsystem.dtos.CreatePatientRequestDto;
import com.example.patientmgmtsystem.dtos.CreatePatientResponseDto;
import com.example.patientmgmtsystem.models.BloodGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.GregorianCalendar;

@SpringBootApplication
public class PatientMgmtSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PatientMgmtSystemApplication.class, args);
    }

    private PatientController patientController;

    @Autowired
    public PatientMgmtSystemApplication(PatientController patientController) {
        this.patientController = patientController;
    }

    @Override
    public void run(String... args) throws Exception {

        // add a patient
        CreatePatientRequestDto requestDto = new CreatePatientRequestDto();
        requestDto.setEmail("gaurav@gmail.com");
        requestDto.setName("Gaurav");
        requestDto.setAddress("Yeola");
        Date birthDate = new GregorianCalendar(1998, 3, 14).getTime();
        requestDto.setBirthDate(birthDate);
        requestDto.setBloodGroup(BloodGroup.O_POSITIVE);
        requestDto.setContactNumber("1234567890");
        requestDto.setRegistrationNumber(542534L);

        CreatePatientResponseDto responseDto = this.patientController.addPatient(requestDto);

        System.out.println(responseDto);
    }
}
