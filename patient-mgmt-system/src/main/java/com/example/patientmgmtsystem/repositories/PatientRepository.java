package com.example.patientmgmtsystem.repositories;

import com.example.patientmgmtsystem.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findAllByEmail(String email);

    List<Patient> findAllByEmailContaining(String emailString);

}
