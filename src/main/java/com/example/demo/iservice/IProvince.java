package com.example.demo.iservice;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Province;

public interface IProvince {
	
	public Province add(Province province);
	public void remove(Long id);
	public Optional<Province> findProvinceById(Long id);
	public List<Province> getAll();
	

}
