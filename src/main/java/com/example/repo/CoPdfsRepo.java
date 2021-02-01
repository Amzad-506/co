package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.CoPdfs;

public interface CoPdfsRepo extends JpaRepository<CoPdfs, Serializable>{

}
