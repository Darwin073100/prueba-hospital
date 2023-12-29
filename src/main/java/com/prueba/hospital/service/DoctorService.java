package com.prueba.hospital.service;

import com.prueba.hospital.entity.Doctor;
import com.prueba.hospital.generic.GenericFirms;
import com.prueba.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements GenericFirms<Doctor> {

    private final DoctorRepository repository;

    @Autowired
    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Doctor findById(int id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public List<Doctor> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Doctor save(Doctor doctor) {
        return null;
    }

    @Override
    public Doctor update(Doctor doctor) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
