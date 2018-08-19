package com.jessienwei.web.dto;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "houses")
@EntityListeners(AuditingEntityListener.class)
public class HouseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long house_id;

	private String street;

	private String city;

	private String postCode;

	private String country;

	private Integer price;

	private Integer size;

	private Integer rooms;

	private Float bathRooms;

	private Integer garages;

	private Date availableDate;

	private String basement;

	private Boolean ac;

	private Boolean gasHeat;

	private Boolean fencedYard;

	private Boolean washerDryer;

	private Boolean deck;

	private Boolean balcony;

	private Boolean storage;

	private String introduction;

	private String houseName;

	private TypeDTO type;

	private AreaDTO area;

	private UserDTO user;




	@OneToOne
	@JoinColumn(name = "user_id")
	//@NotBlank
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getHouse_id() {
		return house_id;
	}

	public void setHouse_id(Long house_id) {
		this.house_id = house_id;
	}

	@JsonIgnore
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "type_id")
	public TypeDTO getType() {
		return type;
	}

	public void setType(TypeDTO type) {
		this.type = type;
	}

	@JsonIgnore
	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "area_id")

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}


	@NotBlank
	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	@NotBlank
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@NotBlank
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@NotBlank
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Float getBathRooms() {
		return bathRooms;
	}

	public void setBathRooms(Float bathRooms) {
		this.bathRooms = bathRooms;
	}

	public Integer getGarages() {
		return garages;
	}

	public void setGarages(Integer garages) {
		this.garages = garages;
	}

	@Column(nullable = false, name = "available_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public Boolean getAc() {
		return ac;
	}

	public void setAc(Boolean ac) {
		this.ac = ac;
	}

	public Boolean getGasHeat() {
		return gasHeat;
	}

	public void setGasHeat(Boolean gasHeat) {
		this.gasHeat = gasHeat;
	}

	public Boolean getFencedYard() {
		return fencedYard;
	}

	public void setFencedYard(Boolean fencedYard) {
		this.fencedYard = fencedYard;
	}

	public Boolean getWasherDryer() {
		return washerDryer;
	}

	public void setWasherDryer(Boolean washerDryer) {
		this.washerDryer = washerDryer;
	}

	public Boolean getDeck() {
		return deck;
	}

	public void setDeck(Boolean deck) {
		this.deck = deck;
	}

	public Boolean getBalcony() {
		return balcony;
	}

	public void setBalcony(Boolean balcony) {
		this.balcony = balcony;
	}

	public Boolean getStorage() {
		return storage;
	}

	public void setStorage(Boolean storage) {
		this.storage = storage;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public String toString() {
		return "HouseDTO [house_id=" + house_id + ", street=" + street + ", city=" + city + ", postCode=" + postCode
				+ ", country=" + country + ", price=" + price + ", size=" + size + ", rooms=" + rooms + ", bathRooms="
				+ bathRooms + ", garages=" + garages + ", availableDate=" + availableDate + ", basement=" + basement
				+ ", ac=" + ac + ", gasHeat=" + gasHeat + ", fencedYard=" + fencedYard + ", washerDryer=" + washerDryer
				+ ", deck=" + deck + ", balcony=" + balcony + ", storage=" + storage + ", introduction=" + introduction
				+ ", houseName=" + houseName + ", type=" + type + ", area=" + area + "]";
	}








}
