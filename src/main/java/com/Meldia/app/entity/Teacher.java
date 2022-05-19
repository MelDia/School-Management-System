package com.Meldia.app.entity;

import javax.persistence.*;

/**
 *
 * @author https://github.com/MelDia
 */
@Entity
@Table(name = "teachers")
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teachers")
    private Long id;
    
    @Column(name = "first_name", nullable = false)
    private String name;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "contact")
    private String contact;
    
    @Column(name = "signature")
    private String signature;
    
    @Column(name = "status")
    private String status;

    public Teacher() {
    }

    public Teacher(Long id, String name, String lastName, String contact, String signature, String status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.contact = contact;
        this.signature = signature;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

}
