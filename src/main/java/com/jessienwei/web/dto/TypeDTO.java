package com.jessienwei.web.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "type")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class TypeDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	private Long type_id;

	private String type_name;

	private Set<HouseDTO> houses = new HashSet<HouseDTO>();



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getType_id() {
		return type_id;
	}
	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}

	@OneToMany(mappedBy="type")
	public Set<HouseDTO> getHouses() {
		return houses;
	}
	public void setHouses(Set<HouseDTO> houses) {
		this.houses = houses;
	}
	@Column(name = "type_name")
	@NotBlank
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	@Override
	public String toString() {
		return "TyperDTO [type_id=" + type_id + ", type_name=" + type_name + "]";
	}
}
