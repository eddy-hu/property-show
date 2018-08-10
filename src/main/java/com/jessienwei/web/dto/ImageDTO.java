package com.jessienwei.web.dto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "image")
@EntityListeners(AuditingEntityListener.class)
public class ImageDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "house_id")
	@NotNull
	private Long house_id;
	
	@Column(name = "image_name")
	@NotBlank
	private String image_name;
	
	@Column(name = "image_path")
	@NotBlank
	private String image_path;

	public Long getHouse_id() {
		return house_id;
	}

	public void setHouse_id(Long house_id) {
		this.house_id = house_id;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ImageDTO [house_id=" + house_id + ", image_name=" + image_name + ", image_path=" + image_path + "]";
	}
	


}
