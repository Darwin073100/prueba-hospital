package com.prueba.hospital.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "doctor_id", nullable = false)
    private Integer doctorId;
    @Column(name = "office_id", nullable = false)
    private Integer officeId;
    @Column(name="date_appointment")
    private Date dateAppointment;
    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "office_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Office office;

    public Appointment() {
    }

    public Appointment(Integer id, Integer doctorId, Integer officeId, Date dateAppointment) {
        this.id = id;
        this.doctorId = doctorId;
        this.officeId = officeId;
        this.dateAppointment = dateAppointment;
    }

    public Appointment(Integer id, Date dateAppointment) {
        this.id = id;
        this.dateAppointment = dateAppointment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(Date dateAppointment) {
        this.dateAppointment = dateAppointment;
    }
}
