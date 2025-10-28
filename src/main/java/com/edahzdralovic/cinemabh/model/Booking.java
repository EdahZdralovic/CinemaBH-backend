package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.BookingStatusEnum;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private BookingStatusEnum status;

    private Double price;
    private Timestamp reservedAt;
    private Timestamp reservedUntil;
    private Timestamp paidAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "booking")
    private List<Ticket> tickets;
}
