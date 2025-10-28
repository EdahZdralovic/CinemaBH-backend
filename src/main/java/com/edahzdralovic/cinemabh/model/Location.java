package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String country;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "location")
    private List<Venue> venues;
}
