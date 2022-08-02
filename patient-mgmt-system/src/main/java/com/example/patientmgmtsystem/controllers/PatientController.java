package com.example.patientmgmtsystem.controllers;


import com.example.patientmgmtsystem.dtos.CreatePatientRequestDto;
import com.example.patientmgmtsystem.dtos.CreatePatientResponseDto;
import com.example.patientmgmtsystem.dtos.ResponseStatus;
import com.example.patientmgmtsystem.models.Patient;
import com.example.patientmgmtsystem.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PatientController {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    public CreatePatientResponseDto addPatient(CreatePatientRequestDto requestDto) {

        Patient patient = patientService.addPatient(requestDto);

        CreatePatientResponseDto responseDto = new CreatePatientResponseDto();
        responseDto.setStatus(ResponseStatus.SUCCESS);
        responseDto.setBirthDate(patient.getBirthDate());
        responseDto.setAddress(patient.getAddress());
        responseDto.setBloodGroup(patient.getBloodGroup());
        responseDto.setEmail(patient.getEmail());
        responseDto.setContactNumber(patient.getContactNumber());
        responseDto.setName(patient.getName());
        responseDto.setRegistrationNumber(patient.getRegistrationNumber());
        responseDto.setId(patient.getId());

        return responseDto;
    }

}
