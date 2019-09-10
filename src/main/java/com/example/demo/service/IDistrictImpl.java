package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.District;
import com.example.demo.iservice.IDistrict;
import com.example.demo.repository.DistrictRepository;

@Service
public class IDistrictImpl implements IDistrict {

	@Autowired
	private DistrictRepository districtRepository;
	
	@Override
	public District add(District district) {
		return districtRepository.save(district);
	}



	@Override
	public List<District> getAll() {
		return districtRepository.findAll();
	}



	@Override
	public void remove(Long id) {
	 districtRepository.deleteById(id);
		
	}



	@Override
	public Optional<District> findById(Long id) {
		return districtRepository.findById(id);
		
	}

}
