package com.example.demo.repository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.District;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {

}
