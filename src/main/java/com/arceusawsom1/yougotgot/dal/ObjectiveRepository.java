package com.arceusawsom1.yougotgot.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arceusawsom1.yougotgot.model.Objective;

@Repository
public interface ObjectiveRepository extends JpaRepository<Objective, Integer>{

}
