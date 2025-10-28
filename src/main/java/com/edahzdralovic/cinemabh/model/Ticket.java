package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne @JoinColumn(name = "projection_id")
    private Projection projection;

    @ManyToOne @JoinColumn(name = "booking_id")
    private Booking booking;

    private Timestamp createdAt;
    private Timestamp updatedAt;
}
