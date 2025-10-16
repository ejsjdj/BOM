package com.example.BOM.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Material implements Comparable<Material> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int QTY;
	String name;
	String size;
	String code;
	String type;
	boolean ready;
	boolean used;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "drawing")
	private Drawing drawing;
	
	@Override
	public int compareTo(Material o) {
		return this.type.compareTo(o.type);
	}
}