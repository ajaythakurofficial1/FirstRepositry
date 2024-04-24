package com.nt.entuty;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="country")

public class Country implements Serializable {
  @Id
  private Integer id;
  @Override
public String toString() {
	return "Country [id=" + id + ", country=" + country + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
private String country;
}
