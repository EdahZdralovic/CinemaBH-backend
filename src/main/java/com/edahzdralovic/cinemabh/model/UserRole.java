package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.UserRoleEnum;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum role;

    private String name;
    private Timestamp createdAt;
}
