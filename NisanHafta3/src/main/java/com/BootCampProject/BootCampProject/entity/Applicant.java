package com.BootCampProject.BootCampProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant extends User{


    public Applicant(String userName, String firstName,
                     String lastName, String dateOfBirth, String nationalIdentity, String email, String password, String about) {
        super(userName, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.about = about;
    }

    public Applicant() {

    }


    @Column(name = "about")
    private  String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


}
