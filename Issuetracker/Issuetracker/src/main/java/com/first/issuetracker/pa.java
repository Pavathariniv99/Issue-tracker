package com.first.issuetracker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sam1")

public class pa {
	
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO) Long Ticketnumber;
	
	private Long Ticketnumber1;
	private String Empid;
	private String Empname;
	private String project;
	private String issues;
	private String comment;
	private String others;
	private String status;
	
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	protected pa()
	{  
		super();
		this.Empid=Empid;
		this.Empname=Empname;;
		this.project=project;
		this.issues=issues;
		this.comment=comment;
		this.others=others;
		this.status=status;
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getIssues() {
		return issues;
	}
	public void setIssues(String issues) {
		this.issues = issues;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Long getTicketnumber1() {
		return Ticketnumber1;
	}
	public void setTicketnumber(Long ticketnumber1) {
		Ticketnumber = ticketnumber1;
	}
}


	
	
	