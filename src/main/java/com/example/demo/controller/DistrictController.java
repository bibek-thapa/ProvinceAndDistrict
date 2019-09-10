package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.District;
import com.example.demo.iservice.IDistrict;

@RestController
public class DistrictController {
	
	
	@Autowired
	private IDistrict districtService;
	
	@RequestMapping(method = RequestMethod.POST,name = "/district/add")
	public District add (@RequestBody District district) 
	{
		return districtService.add(district);
	}
	
	@GetMapping(value = "/district")
	public List<District> getAll()
	{
		return districtService.getAll();
	}
	
	@DeleteMapping(value="/district/{id}")
	public void deleteById(@PathVariable Long id) 
	{
		districtService.remove(id);
	}

	@GetMapping(value="/district/{id}")
	public Optional<District> findById(@PathVariable Long id) 
	{
		return districtService.findById(id);
	}

}
