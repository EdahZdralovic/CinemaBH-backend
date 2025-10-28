package com.edahzdralovic.cinemabh.model;

import com.edahzdralovic.cinemabh.model.enums.MediaTypeEnum;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "movie_media")
public class MovieMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Enumerated(EnumType.STRING)
    private MediaTypeEnum mediaType;

    private String mediaUrl;
    private Timestamp createdAt;
}
