package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "co_triggers")
public class CoTriggers {

	@Id
	@Column(name = "trg_id")
	private int trgId;
	@Column(name = "case_num")
	private int caseNum;
	@Column(name = "create_dt")
	private Date createDt;
	@Column(name = "trg_status")
	private String trgStatus;
	@Column(name = "update_dt")
	private Date updateDt;
	
}
