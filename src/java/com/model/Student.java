package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.ospinah
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name="Student.getAll",query="SELECT e FROM Student e"))
public class Student implements Serializable {
    @Column
    @Id
    private String studentId;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String yearLevel;
    
    public Student(String studentId, String firstname, String lastname, String
        yearLevel) {

        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearLevel = yearLevel;
    }
    
    public Student() {}
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String id) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }
}
