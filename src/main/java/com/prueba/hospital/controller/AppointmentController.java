package com.prueba.hospital.controller;

import com.prueba.hospital.entity.Appointment;
import com.prueba.hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/appointment")
public class AppointmentController {
    private final AppointmentService service;

    @Autowired
    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<Appointment> save(@RequestBody Appointment appointment){
        return new ResponseEntity<>(this.service.save(appointment), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Appointment>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Appointment> findById(@PathVariable int id){
        return new ResponseEntity<>(this.service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        try{
            this.service.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.resolve(500));
        }
    }
}
