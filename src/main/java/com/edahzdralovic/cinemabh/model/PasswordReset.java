package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "password_reset")
public class PasswordReset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    private String codeHash;
    private Timestamp expiresAt;
    private Timestamp createdAt;
}
