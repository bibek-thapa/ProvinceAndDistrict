package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Province;


@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {
	
}
