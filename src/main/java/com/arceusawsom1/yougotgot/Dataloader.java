package com.arceusawsom1.yougotgot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.arceusawsom1.yougotgot.dal.GameRepository;
import com.arceusawsom1.yougotgot.dal.ObjectiveRepository;
import com.arceusawsom1.yougotgot.dal.PlayerRepository;
import com.arceusawsom1.yougotgot.model.Game;
import com.arceusawsom1.yougotgot.model.Objective;
import com.arceusawsom1.yougotgot.model.Player;

@Service
public class Dataloader implements ApplicationRunner{
	private GameRepository gameRepo;
	private ObjectiveRepository objectiveRepo;
	private PlayerRepository playerRepo;
	@Autowired
	public Dataloader(GameRepository gameRepo, ObjectiveRepository objectiveRepo, PlayerRepository playerRepo) {
		super();
		this.gameRepo = gameRepo;
		this.objectiveRepo = objectiveRepo;
		this.playerRepo = playerRepo;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Game game1 = new Game("Dummy Game");
		Player player1 = new Player("James");
		Player player2 = new Player("Jamie");
		Player player3 = new Player("Jonah");
		Player player4 = new Player("Jessica");
		player1.setGame(game1);
		player2.setGame(game1);
		player3.setGame(game1);
		player4.setGame(game1);
		
		
		gameRepo.save(game1);
		playerRepo.save(player1);
		playerRepo.save(player2);
		playerRepo.save(player3);
		playerRepo.save(player4);
		
		List<Objective> objectives = new ArrayList<Objective>();
		objectives.add(new Objective("Get someone to wear a hat"));
		objectives.add(new Objective("Get someone to say 'what??'"));
		
		objectives.addAll(objectives);
	}

}
