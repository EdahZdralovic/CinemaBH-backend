package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.PgRatingEnum;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String language;
    private String description;
    private Integer duration;
    private String coverImageUrl;
    private Date projectionStart;
    private Date projectionEnd;

    @Enumerated(EnumType.STRING)
    private PgRatingEnum pgRating;

    private BigDecimal imbdRating;
    private BigDecimal rottenTometosRating;
    private Timestamp archivedAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieMedia> media;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieGenre> genres;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieCrew> crew;
}
