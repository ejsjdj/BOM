package com.example.BOM.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Drawing implements Comparable<Drawing> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	boolean ready;
	boolean finished;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="drawing")
	private List<Material> materials;
	
	@Override
	public int compareTo(Drawing o) {
		return this.name.compareTo(o.name);
	}
}
