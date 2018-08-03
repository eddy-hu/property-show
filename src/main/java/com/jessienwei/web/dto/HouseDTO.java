package com.jessienwei.web.dto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "house")
public class HouseDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long house_id;

	@Column(name = "house")
	@NotBlank
	private String house_name;


}
