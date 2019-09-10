package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Province;
import com.example.demo.iservice.IProvince;
import com.example.demo.repository.ProvinceRepository;

@Service
public class IProvinceImpl implements IProvince{

	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Override
	public Province add(Province province) {
		return provinceRepository.save(province);
	}

	@Override
	public void remove(Long id) {
		provinceRepository.deleteById(id);
	}
	@Override
	public List<Province> getAll() {
		return provinceRepository.findAll();
	}

	@Override
	public Optional<Province> findProvinceById(Long id) {
		return provinceRepository.findById(id);
	}

}
