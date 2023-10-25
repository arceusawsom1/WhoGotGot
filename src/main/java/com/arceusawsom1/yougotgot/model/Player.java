package com.arceusawsom1.yougotgot.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToOne
	private Game game;
	@ManyToMany
	private List<Objective> objectives;
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public List<Objective> getObjectives() {
		return objectives;
	}
	public void setObjectives(List<Objective> objectives) {
		this.objectives = objectives;
	}
	public void addObjective(Objective objective) {
		this.objectives.add(objective);
	}
}
