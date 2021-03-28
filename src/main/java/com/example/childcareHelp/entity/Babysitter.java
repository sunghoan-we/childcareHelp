package com.example.childcareHelp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Babysitter")
public class Babysitter {

    @Id
    private Integer snn;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String heighestEducation;
    private String phoneNumber;

    public Integer getSnn() {
        return snn;
    }

    public void setSnn(Integer snn) {
        this.snn = snn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeighestEducation() {
        return heighestEducation;
    }

    public void setHeighestEducation(String heighestEducation) {
        this.heighestEducation = heighestEducation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
