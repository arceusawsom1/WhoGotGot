package com.arceusawsom1.yougotgot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {
	@Id
	@GeneratedValue
	private int id;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String session;

	public Game(String session) {
		super();
		this.session = session;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}
	
	
}
