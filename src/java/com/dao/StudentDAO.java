/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author felipe.ospinah
 */
@Stateless
public class StudentDAO implements StudentDAOLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addStudent(Student student) {
        em.persist(student);
    }

    @Override
    public void editStudent(Student student) {
        em.merge(student);
    }

    @Override
    public void deleteStudent(String studentId) {
        em.remove(getStudent(studentId));
    }

    @Override
    public Student getStudent(String idStudent) {
        return em.find(Student.class, idStudent);
    }

    @Override
    public List<Student> getAllStudents() {
        return em.createNamedQuery("Student.getAll").getResultList();
    }
    
    
}
