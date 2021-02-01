package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "batch_summary")
public class BatchSummary {

	@Id
	@Column(name = "summary_id")
	private int summaryId;
	@Column(name = "batch_name")
	private String batchName;
	@Column(name = "failure_trigger_count")
	private int failureTriggerCount;
	@Column(name = "success_trigger_count")
	private int successTriggerCount;
	@Column(name = "total_trigger_processed")
	private int totalTriggerProcessed;
	
}
