package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable>{

}
