package com.lms.client.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(unique = true)
    private String clientCode;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String mobileNumber;

    @Column(unique = true)
    private String email;

    private String panNumber;

    private LocalDate dateOfBirth;

    private String kycStatus;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}