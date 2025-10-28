package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "movie_crew")
public class MovieCrew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne @JoinColumn(name = "movie_id")
    private Movie movie;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    private String characterName;
}
