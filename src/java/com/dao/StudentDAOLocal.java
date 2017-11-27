/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author felipe.ospinah
 */
@Local
public interface StudentDAOLocal {

    void addStudent(Student student);

    void editStudent(Student student);
    
    void deleteStudent(String studentId);

    Student getStudent(String idStudent);

    List<Student> getAllStudents();
    
}
