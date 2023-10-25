package com.arceusawsom1.yougotgot.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arceusawsom1.yougotgot.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

}
