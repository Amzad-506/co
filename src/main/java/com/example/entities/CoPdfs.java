package com.example.entities;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "co_pdfs")
public class CoPdfs {

	@Id
	@Column(name = "co_pdf_id")
	private int coPdfId;
	@Column(name = "plane_status")
	private String planeStatus;
	@Column(name = "case_number")
	private String caseNumber;
	@Column(name = "pdf_document")
	private Blob pdfDocument;
	@Column(name = "plane_name")
	private String planeName;
}
