package com.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table (name="classroom")
@Data
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String name;

	public Classroom(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Classroom() {
		super();
	}
	
	
	
	
}
