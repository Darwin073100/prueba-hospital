package com.prueba.hospital.controller;

import com.prueba.hospital.entity.Doctor;
import com.prueba.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/api/doctor")
public class DoctorController {
    private final DoctorService service;
    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Doctor>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
