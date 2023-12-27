package com.prueba.hospital.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(name = "pa_surname", nullable = false)
    private String paSurname;
    @Column(name = "ma_surname", nullable = false)
    private String maSurname;
    @Column(nullable = false)
    private String speciality;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
    private List<Appointment> appointments;
    public Doctor() {
    }

    public Doctor(Integer id, String name, String paSurname, String maSurname, String speciality) {
        this.id = id;
        this.name = name;
        this.paSurname = paSurname;
        this.maSurname = maSurname;
        this.speciality = speciality;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String paSurname) {
        this.paSurname = paSurname;
    }

    public String getMaSurname() {
        return maSurname;
    }

    public void setMaSurname(String maSurname) {
        this.maSurname = maSurname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
