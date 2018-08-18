package com.jessienwei.web.dto;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import javax.validation.constraints.NotBlank;
//import javax.persistence.*;
//
//import java.io.Serializable;
//import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class UserDTO{

//	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long userId;
//	
//	@Column(name="fname")
//	@NotBlank
//	private String firstName;
//	
//	@Column(name="lname")
//	@NotBlank
//	private String lastName;
//	
//	@Column(name="pswd")
//	@NotBlank
//	private String password;
//	
//	@Column(name="email")
//	private String email;
//	
//	@Column(name="phone")
//	private String phone;
//	
//	@Column(nullable = false, updatable = false, name="created_at")
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date createdAt;
//
//    @Column(nullable = false, name="updated_at")
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    private Date updatedAt;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "username")
	@NotEmpty(message = "Please provide your name")
	private String username;
	
	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Please provide a valid Email")
	@NotEmpty(message = "Please provide an Email")
	private String email;
	
	@Column(name = "phone")
	@NotEmpty(message = "Please provide your phone number")
	private String phone;	

	@Column(name = "password")
	@NotEmpty(message = "Please provide a password")
	private String password;	

//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	
//	@Override
//	public String toString() {
//		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + 
//			   ", email=" + email + ", phone=" + phone + "]";
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return this.getUsername()+this.getEmail()+this.getPhone();
	}
}

