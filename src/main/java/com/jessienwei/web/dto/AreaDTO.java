package com.jessienwei.web.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "area")
public class AreaDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	private Long area_id;

	private String area_name;

	private Set<HouseDTO> houses = new HashSet<HouseDTO>();


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getArea_id() {
		return area_id;
	}
	public void setArea_id(Long area_id) {
		this.area_id = area_id;
	}

	@Column(name = "area_name")
	@NotBlank
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	@OneToMany(mappedBy="area")
	public Set<HouseDTO> getHouses() {
		return houses;
	}
	public void setHouses(Set<HouseDTO> houses) {
		this.houses = houses;
	}



	@Override
	public String toString(){
		return "AreaDTO [area_id=" + area_id + ", area_name=" + area_name + "]";
	}

}
