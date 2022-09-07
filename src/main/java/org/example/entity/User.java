package org.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
@Data
public class User {
    @Id
    @Column(name = "UserId")
    private int userId;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;
}
