package com.jessienwei.web.dto;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "area")
public class AreaDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long area_id;

	@Column(name = "area_name")
	@NotBlank
	private String area_name;



	public Long getArea_id() {
		return area_id;
	}
	public void setArea_id(Long area_id) {
		this.area_id = area_id;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	@Override
	public String toString(){
		return "AreaDTO [area_id=" + area_id + ", area_name=" + area_name + "]";
	}

}
