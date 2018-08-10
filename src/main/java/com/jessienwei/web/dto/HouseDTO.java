package com.jessienwei.web.dto;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "houses")
@EntityListeners(AuditingEntityListener.class)
public class HouseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long house_id;
	
	@Column(name="house_name")
	@NotBlank
	private String houseName;
	
	@Column(name="type_id")
	@NotNull
	private Integer typeId;
	
	@Column(name="area_id")
	@NotNull
	private Integer areaId;
	
	@Column(name="street")
	@NotBlank
	private String street;
	
	@Column(name="city")
	@NotBlank
	private String city;
	
	@Column(name="postcode")
	@NotBlank
	private String postCode;
	
	@Column(name="country")
	@NotBlank
	private String country;
	
	@Column(name="price")
	@NotNull
	private Integer price;
	
	@Column(name="size")
	@NotNull
	private Integer size;
	
	@Column(name="rooms")
	@NotNull
	private Integer rooms;
	
	@Column(name="bathrooms")
	@NotNull
	private Float bathRooms;
	
	@Column(name="garages")
	@NotNull
	private Integer garages;
	
	@Column(nullable = false, name="available_date")
    @Temporal(TemporalType.TIMESTAMP)
	private Date availableDate;

	@Column(name="basement")
	@NotBlank
	private String basement;
	
	@Column(name="ac")
	@NotNull
	private Boolean ac;
	
	@Column(name="gasheat")
	@NotNull
	private Boolean gasHeat;
	
	@Column(name="fencedyard")
	@NotNull
	private Boolean fencedYard;
	
	@Column(name="washerdryer")
	@NotNull
	private Boolean washerDryer;
	
	@Column(name="deck")
	@NotNull
	private Boolean deck;
	
	@Column(name="balcony")
	@NotNull
	private Boolean balcony;
	
	@Column(name="storage")
	@NotNull
	private Boolean storage;
	
	@Column(name="introduction")
	private String introduction;


	public Long getHouse_id() {
		return house_id;
	}

	public void setHouse_id(Long house_id) {
		this.house_id = house_id;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

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
		return "HouseDTO [house_id=" + house_id + ", houseName=" + houseName + ", typeId=" + typeId + ", areaId="
				+ areaId + ", street=" + street + ", city=" + city + ", postCode=" + postCode + ", country=" + country
				+ ", price=" + price + ", size=" + size + ", rooms=" + rooms + ", bathRooms=" + bathRooms + ", garages="
				+ garages + ", availableDate=" + availableDate + ", basement=" + basement + ", ac=" + ac + ", gasHeat="
				+ gasHeat + ", fencedYard=" + fencedYard + ", washerDryer=" + washerDryer + ", deck=" + deck
				+ ", balcony=" + balcony + ", storage=" + storage + ", introduction=" + introduction + "]";
	}
	
	
}

