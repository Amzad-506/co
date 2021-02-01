package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.BatchRunDtls;

public interface BatchRunDtlsRepo extends JpaRepository<BatchRunDtls, Serializable>{

}
