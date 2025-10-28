package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;

public class MovieRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;
    private String ratingSite;
    private String ratingUrl;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
