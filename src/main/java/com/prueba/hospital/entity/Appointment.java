package com.prueba.hospital.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="date_appointment")
    private LocalDateTime dateAppointment;

    public Appointment() {
    }

    public Appointment(Integer id, LocalDateTime dateAppointment) {
        this.id = id;
        this.dateAppointment = dateAppointment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(LocalDateTime dateAppointment) {
        this.dateAppointment = dateAppointment;
    }
}
