package com.prueba.hospital.repository;

import com.prueba.hospital.entity.Doctor;
import org.springframework.data.repository.ListCrudRepository;

public interface DoctorRepository extends ListCrudRepository<Doctor, Integer> {
}
