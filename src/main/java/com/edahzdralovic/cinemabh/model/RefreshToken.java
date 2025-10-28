package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refresh_token")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    private String tokenHash;
    private Timestamp createdAt;
    private Timestamp expiresAt;
    private Timestamp revokedAt;
}
