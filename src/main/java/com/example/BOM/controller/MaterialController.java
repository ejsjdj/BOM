package com.example.BOM.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BOM.domain.Material;
import com.example.BOM.repository.MaterialRepository;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/material")
public class MaterialController {
	private final MaterialRepository repository;
		
	public MaterialController(MaterialRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/materials")
	public Iterable<Material> getMaterial() {
		return repository.findAll();
	}
	
    @PostMapping("/update")
    public ResponseEntity<?> push(HttpServletRequest req, @RequestBody Material material) {
    		repository.save(material);
    	
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
}
