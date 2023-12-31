package com.prueba.hospital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "office")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "office_number")
    private Integer officeNumber;
    @Column(unique = true)
    private String floor;

    @JsonIgnore
    @OneToMany(mappedBy = "office", fetch = FetchType.EAGER)
    private List<Appointment> appointments;

    public Office() {
    }

    public Office(Integer id, Integer officeNumber, String floor) {
        this.id = id;
        this.officeNumber = officeNumber;
        this.floor = floor;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Integer officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
