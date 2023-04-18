package com.example.demo.models;

public class StarWarResultDTO {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String[] films;
    private String[] vehicles;
    private String[] starships;
    private String created;
    private String edited;
    private String url;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getHair_color() {
		return hair_color;
	}
	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}
	public String getSkin_color() {
		return skin_color;
	}
	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}
	public String getEye_color() {
		return eye_color;
	}
	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}
	public String getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	public String[] getFilms() {
		return films;
	}
	public void setFilms(String[] films) {
		this.films = films;
	}
	public String[] getVehicles() {
		return vehicles;
	}
	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
	}
	public String[] getStarships() {
		return starships;
	}
	public void setStarships(String[] starships) {
		this.starships = starships;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
    
    
}
/*
{
	"name": "C-3PO",
	"height": "167",
	"mass": "75",
	"hair_color": "n/a",
	"skin_color": "gold",
	"eye_color": "yellow",
	"birth_year": "112BBY",
	"gender": "n/a",
	"homeworld": "https://swapi.dev/api/planets/1/",
	"films": [
		"https://swapi.dev/api/films/1/",
		"https://swapi.dev/api/films/2/",
		"https://swapi.dev/api/films/3/",
		"https://swapi.dev/api/films/4/",
		"https://swapi.dev/api/films/5/",
		"https://swapi.dev/api/films/6/"
	],
	"species": [
		"https://swapi.dev/api/species/2/"
	],
	"vehicles": [],
	"starships": [],
	"created": "2014-12-10T15:10:51.357000Z",
	"edited": "2014-12-20T21:17:50.309000Z",
	"url": "https://swapi.dev/api/people/2/"
}
*/
