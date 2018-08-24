package com.jessienwei.web.dto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "images")
@EntityListeners(AuditingEntityListener.class)
public class ImageDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Long imageId;

	@Column(name = "image_name")
	@NotBlank
	private String image_name;

	private HouseDTO houseDTO;

	/*
	 * @Id
	 *
	 * @Column(name = "house_id")
	 *
	 * @NotNull
	 */
	/* private Long house_id; */


	@ManyToOne
	public HouseDTO getHouseDTO() {
		return houseDTO;
	}

	public void setHouseDTO(HouseDTO houseDTO) {
		this.houseDTO = houseDTO;
	}

	@Column(name = "image_path")
	@NotBlank
	private String image_path;

	public String getImage_name() {
		return image_name;
	}

	public String getImage_path() {
		return image_path;
	}

	@Id
	@GeneratedValue
	public Long getImageId() {
		return imageId;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	/*
	 * @Override public String toString() { return "ImageDTO [house_id=" +
	 * house_id + ", image_name=" + image_name + ", image_path=" + image_path +
	 * "]"; }
	 */

}
