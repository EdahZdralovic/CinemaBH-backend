package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "projection")
public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "venue_id")
    private Venue venue;

    @ManyToOne @JoinColumn(name = "movie_id")
    private Movie movie;

    private Date dateOfProjection;
    private Time timeOfProjection;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
