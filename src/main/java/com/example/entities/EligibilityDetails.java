package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "eligibilty_details")
public class EligibilityDetails {

	@Id
	@Column(name = "ed_trace_id")
	private int edTraceId;
	@Column(name = "benifit_amt")
	private String benifitAmt;
	@Column(name = "case_num")
	private int caseNum;
	@Column(name = "create_dt")
	private Date createDt;
	@Column(name = "denial_reason")
	private String denialReason;
	@Column(name = "plane_end_dt")
	private String planeEndDt;
	@Column(name = "plane_name")
	private String planeName;
	@Column(name = "plane_start_dt")
	private String planeStartDt;
	@Column(name = "plan_status")
	private String planStatus;
	@Column(name = "update_dt")
	private Date updateDt;
	
}
