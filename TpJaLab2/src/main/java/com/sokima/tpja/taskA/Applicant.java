package com.sokima.tpja.taskA;

import java.util.Arrays;

// e.g. Abiturient
public class Applicant {

    private Long id;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private Integer[] scores;

    public Applicant() {
    }

    public Applicant(Long id, String name, String surname, String address, String phone, Integer[] scores) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.scores = scores;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Integer[] getScores() {
        return scores;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setScores(Integer[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
