package com.edahzdralovic.cinemabh.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer capacity_regular_seats;
    private Integer capacity_lovebox_seats;


    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;
}

