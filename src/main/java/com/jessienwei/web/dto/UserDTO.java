package com.jessienwei.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long user_id;

	private String userName;

	private String password;

	private String phone;

	private String email;
	

	private Set<HouseDTO> houses = new HashSet<HouseDTO>();
	
	private RoleDTO role_id;
	
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	public RoleDTO getRole_id() {
		return role_id;
	}

	public void setRole_id(RoleDTO role_id) {
		this.role_id = role_id;
	}

	@Column(nullable = false, updatable = false, name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false, name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUserId() {
		return user_id;
	}

	public void setUserId(Long userId) {
		this.user_id = userId;
	}

	public String getEmail() {
		return email;
	}

	@NotBlank
	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	@NotBlank
	public String getUserName() {
		return userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@ManyToMany
	@JoinTable(name = "favorite",
		joinColumns = {@JoinColumn(name = "user_id")},
		inverseJoinColumns = {@JoinColumn(name = "house_id")}
			)
	public Set<HouseDTO> getHouses() {
		return houses;
	}

	public void setHouses(Set<HouseDTO> houses) {
		this.houses = houses;
	}

	@Override
	public String toString() {
		String favoriteHouse = "";
		for(HouseDTO h : houses){
			favoriteHouse +=h.getHouse_id();
		}
		return "UserDTO [user_id=" + user_id + ", userName=" + userName + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + ", houses=" + houses.size() + ": " +favoriteHouse + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]"; 
	}





}
