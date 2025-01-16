package com.nmt.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	private String productName;

	@ManyToOne
	@JoinColumn(name = "cid")
	@JsonIgnore
	private Category categorypd;
	
}
