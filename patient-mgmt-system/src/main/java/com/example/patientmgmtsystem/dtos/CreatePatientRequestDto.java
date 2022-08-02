package com.example.patientmgmtsystem.dtos;

import com.example.patientmgmtsystem.models.BloodGroup;

import java.util.Date;

public class CreatePatientRequestDto {

    private String name;
    private String email;
    private Long registrationNumber;
    private Date birthDate;
    private String contactNumber;
    private String address;
    private BloodGroup bloodGroup;

    public CreatePatientRequestDto() {

    }

    public CreatePatientRequestDto(String name, String email, Long registrationNumber, Date birthDate, String contactNumber, String address, BloodGroup bloodGroup) {
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.birthDate = birthDate;
        this.contactNumber = contactNumber;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
