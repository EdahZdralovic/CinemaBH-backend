package com.edahzdralovic.cinemabh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "actor_movie")
public class ActorMovie {

    @EmbeddedId
    private ActorMovieKey id;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column(name = "name_in_movie")
    private String nameInMovie;

    public ActorMovie() {}

    public ActorMovie(Actor actor, Movie movie, String nameInMovie) {
        this.actor = actor;
        this.movie = movie;
        this.nameInMovie = nameInMovie;
        this.id = new ActorMovieKey(actor.getId(), movie.getId());
    }
}