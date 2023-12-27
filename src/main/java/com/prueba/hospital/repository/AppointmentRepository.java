package com.prueba.hospital.repository;

import com.prueba.hospital.entity.Appointment;
import org.springframework.data.repository.ListCrudRepository;

public interface AppointmentRepository extends ListCrudRepository<Appointment, Integer> {
}
