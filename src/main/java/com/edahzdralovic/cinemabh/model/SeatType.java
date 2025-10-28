package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.SeatTypeEnum;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "seat_type")
public class SeatType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SeatTypeEnum type;
    //au ovo je problem bio ne smiju se enumi isto zvati kao tabele sjebe se intelijj

    private Double price;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
