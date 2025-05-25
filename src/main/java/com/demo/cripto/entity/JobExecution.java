/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.cripto.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "job_execution")
public class JobExecution implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name="dt_start")
	private Date dtStart;

	@Column(name="dt_end")
	private Date dtEnd;

	@Column(name="output_log")
	private String outputLog;

	public JobExecution() {
	}

	public JobExecution(String jobName) {
		this.name=jobName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtStart() {
		return dtStart;
	}

	public void setDtStart(Date dtStart) {
		this.dtStart = dtStart;
	}

	public Date getDtEnd() {
		return dtEnd;
	}

	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}

	public String getOutputLog() {
		return outputLog;
	}

	public void setOutputLog(String outputLog) {
		this.outputLog = outputLog;
	}
}
