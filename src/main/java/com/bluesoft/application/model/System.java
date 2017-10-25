package com.bluesoft.application.model;

public class System {

	private String name;

	private String description;
	
	private String techDescription;
	
	private String owner;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechDescription() {
		return techDescription;
	}

	public void setTechDescription(String techDescription) {
		this.techDescription = techDescription;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
