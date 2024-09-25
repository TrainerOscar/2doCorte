package org.ogcv.models;

import java.util.Objects;

public class Student {

    private String cif;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String cif, String name, String lastName, String email, String phone) {
        this.cif = cif;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }


    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Student{" +
                "cif='" + cif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cif, student.cif) && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, name, lastName, email, phone);
    }
}
