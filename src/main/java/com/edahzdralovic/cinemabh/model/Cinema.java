package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cinemaName;
    private String cinemaAddress;
    private String cinemaPhone;
    private String cinemaEmail;
    private String city;
    private String country;

    @OneToMany(mappedBy = "cinema")
    private List<Venue> venues = new ArrayList<>();
}
