package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.CoTriggers;

public interface CoTriggersRepo extends JpaRepository<CoTriggers, Serializable>{

}
