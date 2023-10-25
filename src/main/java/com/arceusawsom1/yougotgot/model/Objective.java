package com.arceusawsom1.yougotgot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Objective {
	@Id
	@GeneratedValue
	private int id;
	private String text;
	public Objective(String text) {
		super();
		this.text = text;
	}
	public Objective() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Objective(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
