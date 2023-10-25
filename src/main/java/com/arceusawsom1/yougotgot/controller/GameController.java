package com.arceusawsom1.yougotgot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arceusawsom1.yougotgot.dal.GameRepository;
import com.arceusawsom1.yougotgot.model.Game;

@RestController
@RequestMapping("game")
public class GameController {
	private GameRepository gameRepo;
	@Autowired
	public GameController(GameRepository gameRepo) {
		super();
		this.gameRepo = gameRepo;
	}

	@GetMapping
	public List<Game> findAll(){
		return this.gameRepo.findAll();
	}
}
