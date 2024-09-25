package org.ogcv.dao;

import org.ogcv.interfaces.Operation;
import org.ogcv.models.Student;

import java.util.ArrayList;

public class StudentDao implements Operation {

    private ArrayList<Student> list = new ArrayList<>();


    /** Agrega un estudiante
     *
     */


    @Override
    public void create() {

    }

    @Override
    public void create(Object object) {
        try {
            Student student = (Student) object;
            list.add(student);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Object> read() {
        ArrayList<Object> list = new ArrayList<>();
        list = (ArrayList<Object>) list.clone();
        return list;
    }

    @Override
    public void update(Object object) {
        Student std = (Student) object;
    int index = list.indexOf(std);

    for (Student student : list) {
        if (std.getCif().equals(student.getCif())) {
            std.setName(std.getName());
            std.setLastName(std.getLastName());
            std.setEmail(std.getEmail());
            std.setPhone(std.getPhone());
            return;
             }
        }
    }

    @Override
    public void delete(String cif) {

        for (Student student : list) {
            if (student.getCif().equals(cif)) {
                list.remove(student);
                return;
            }
        }


    }

    @Override
    public Object search(String value) {
        for(Student student : list) {
            if (student.getCif().equals(value)) {
                return student;
            }
        }
    }

    @Override
    public Object search(String name) {
        return null;
    }


}

