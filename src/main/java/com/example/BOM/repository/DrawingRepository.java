package com.example.BOM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BOM.domain.Drawing;

public interface DrawingRepository extends JpaRepository<Drawing, Integer> {

}
