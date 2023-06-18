package com.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student
{
    @Id
    @Column(name="student_id")
    private int studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_city")
    private String studentCity;
    @Column(name = "student_certificate")
    private Certificate certificate;

    public Student()
    {
        super();
    }

    public Student(int studentId, String studentName, String studentCity,Certificate studentCertificate)
    {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.certificate = studentCertificate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
