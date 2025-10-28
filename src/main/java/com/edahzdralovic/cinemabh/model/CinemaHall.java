package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "cinema_hall")
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer regularSeats;
    private Integer loveBoxSeats;
    private Integer vipSeats;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp archivedAt;

    @ManyToOne @JoinColumn(name = "venue_id")
    private Venue venue;

    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;
}
