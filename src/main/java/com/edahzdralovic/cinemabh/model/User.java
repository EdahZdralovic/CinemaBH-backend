package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String street;
    private String imageUrl;
    private String passwordHash;
    private String fullName;
    private String phone;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @ManyToOne @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne @JoinColumn(name = "role_id")
    private UserRole role;
}
