package com.arceusawsom1.yougotgot.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arceusawsom1.yougotgot.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
