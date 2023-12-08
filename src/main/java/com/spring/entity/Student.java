package com.spring.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int stdId;
	private String stdName;
	private String country;
	private String stdMail;
	private long stdMob;
	private Date lastmodified;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStdMail() {
		return stdMail;
	}
	public void setStdMail(String stdMail) {
		this.stdMail = stdMail;
	}
	public long getStdMob() {
		return stdMob;
	}
	public void setStdMob(long stdMob) {
		this.stdMob = stdMob;
	}
	public Date getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", country=" + country + ", stdMail=" + stdMail
				+ ", stdMob=" + stdMob + ", lastmodified=" + lastmodified + "]";
	}
	public Student(String stdName, String country, String stdMail, long stdMob, Date lastmodified) {
		super();
		this.stdName = stdName;
		this.country = country;
		this.stdMail = stdMail;
		this.stdMob = stdMob;
		this.lastmodified = lastmodified;
	}
	public Student() {
		super();
	}
		
}
