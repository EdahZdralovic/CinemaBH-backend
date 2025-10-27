package com.edahzdralovic.cinemabh.repository;

import com.edahzdralovic.cinemabh.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
