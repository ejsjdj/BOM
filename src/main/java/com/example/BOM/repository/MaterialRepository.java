package com.example.BOM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BOM.domain.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
