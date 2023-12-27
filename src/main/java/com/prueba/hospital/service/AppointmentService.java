package com.prueba.hospital.service;

import com.prueba.hospital.entity.Appointment;
import com.prueba.hospital.generic.GenericFirms;
import com.prueba.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppointmentService implements GenericFirms<Appointment> {

    private final AppointmentRepository repository;

    @Autowired
    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Appointment> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Appointment> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Appointment save(Appointment appointment) {
        return this.repository.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
