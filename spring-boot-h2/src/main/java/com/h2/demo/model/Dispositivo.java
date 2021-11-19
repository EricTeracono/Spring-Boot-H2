package com.h2.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public  class Dispositivo {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String mac;
	private String email;
	private String latitude;
	private String longitude;

	
}
