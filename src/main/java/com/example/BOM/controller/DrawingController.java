package com.example.BOM.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BOM.domain.Drawing;
import com.example.BOM.repository.DrawingRepository;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/drawing")
public class DrawingController {
	
	private final DrawingRepository repository;

    public DrawingController(DrawingRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/drawings")
    public Iterable<Drawing> getDrawing() {
    		System.out.println("실행?");
    		return repository.findAll();
    }
    
    @PostMapping("/update")
    public ResponseEntity<?> update(HttpServletRequest req, @RequestBody Drawing drawing) {
    		
    		repository.save(drawing);
    	
    		return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
