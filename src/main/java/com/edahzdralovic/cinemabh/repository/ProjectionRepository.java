package com.edahzdralovic.cinemabh.repository;


import com.edahzdralovic.cinemabh.model.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectionRepository extends JpaRepository<Projection, Long> {


}
