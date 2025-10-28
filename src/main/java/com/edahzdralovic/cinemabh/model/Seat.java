package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer row;
    private Integer collumn;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @ManyToOne @JoinColumn(name = "hall_id")
    private CinemaHall hall;

    @ManyToOne @JoinColumn(name = "type_id")
    private SeatType seatType;
}
