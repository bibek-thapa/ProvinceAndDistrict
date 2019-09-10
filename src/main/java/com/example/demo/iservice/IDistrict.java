package com.example.demo.iservice;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.District;

public interface IDistrict {
	
	public District add(District district);
	public Optional<District> findById(Long id);
	public void remove(Long id);
	public List<District> getAll();

}
