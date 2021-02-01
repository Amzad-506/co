package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "batch_run_dtls")
public class BatchRunDtls {

	@Id
	@Column(name = "batch_run_seq")
	private int batchRunSeq;
	@Column(name = "batch_name")
	private String batchName;
	@Column(name = "batch_run_status")
	private String batchRunStatus;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "instance_num")
	private int instanceNum;
	@Column(name = "start_date")
	private Date startDate;
}
