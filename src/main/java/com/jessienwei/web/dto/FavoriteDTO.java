package com.jessienwei.web.dto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "favorite")
@EntityListeners(AuditingEntityListener.class)
public class FavoriteDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@NotNull
	private Long user_id;
	
	@Column(name = "house_id")
	@NotNull
	private Integer house_id;
	
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Integer getHouse_id() {
		return house_id;
	}

	public void setHouse_id(Integer house_id) {
		this.house_id = house_id;
	}

	@Override
	public String toString() {
		return "FavoriteDTO [user_id=" + user_id + ", house_id=" + house_id + "]";
	}


}
