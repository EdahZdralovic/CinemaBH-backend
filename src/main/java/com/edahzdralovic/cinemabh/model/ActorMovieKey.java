package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActorMovieKey implements Serializable {

    private Long actorId;
    private Long movieId;

    public ActorMovieKey() {}

    public ActorMovieKey(Long actorId, Long movieId) {
        this.actorId = actorId;
        this.movieId = movieId;
    }
}
