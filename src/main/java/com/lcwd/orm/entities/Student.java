package com.lcwd.orm.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String about;
    //student will have only one laptop...therefore Laptop...if there were multiple then we have to use List,array or arraylist
    //if we want to do unidirectional mapping then  use mapped by
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    //OneToOne this is actually unidirectional mapping
    private Laptop laptop;


    //many address
    //@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    //No identifier specified for entity: com.lcwd.orm.entities.Address   .....org.springframework.beans.factory.BeanCreationException:
   // private List<Address> addressList = new ArrayList<>();

    public Student(int studentId, String studentName, String about, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }

    public Student() {
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

   /* public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }*/
}
