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

import com.example.demo.entity.Province;
import com.example.demo.iservice.IProvince;

@RestController
public class ProvinceController {
	
	@Autowired
	private IProvince provinceService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/province/add")
	public Province addProvince(@RequestBody Province province) 
	{
		return provinceService.add(province);
	}
	
	@GetMapping(value = "/provinces")
	public List<Province> getAll()
	{
		return provinceService.getAll();
	}
	
	@DeleteMapping(value="/province/{id}")
	public void deleteById(@PathVariable Long id) 
	{
		
		provinceService.remove(id);
	}
	
	@GetMapping(value="/province/{id}")
	public Optional<Province> findById(@PathVariable Long id) 
	{
		return provinceService.findProvinceById(id);
	}

}
