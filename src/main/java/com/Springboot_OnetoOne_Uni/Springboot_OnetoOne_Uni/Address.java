package com.Springboot_OnetoOne_Uni.Springboot_OnetoOne_Uni;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="studaddress")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int aid;
	String astreet;
	String acity;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAstreet() {
		return astreet;
	}
	public void setAstreet(String astreet) {
		this.astreet = astreet;
	}
	public String getAcity() {
		return acity;
	}
	public void setAcity(String acity) {
		this.acity = acity;
	}
	
	
}
