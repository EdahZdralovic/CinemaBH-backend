package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "person")
    private List<MovieCrew> movieCrew;
}
