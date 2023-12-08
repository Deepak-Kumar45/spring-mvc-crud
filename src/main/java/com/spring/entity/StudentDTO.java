package com.spring.entity;

import java.util.Date;

public class StudentDTO {
	private int fakeId;
	private String fakeName;
	private String fakeCountry;
	private String fakeMail;
	private long fakeMob;
	public int getFakeId() {
		return fakeId;
	}
	public void setFakeId(int fakeId) {
		this.fakeId = fakeId;
	}
	public String getFakeName() {
		return fakeName;
	}
	public void setFakeName(String fakeName) {
		this.fakeName = fakeName;
	}
	public String getFakeCountry() {
		return fakeCountry;
	}
	public void setFakeCountry(String fakeCountry) {
		this.fakeCountry = fakeCountry;
	}
	public String getFakeMail() {
		return fakeMail;
	}
	public void setFakeMail(String fakeMail) {
		this.fakeMail = fakeMail;
	}
	public long getFakeMob() {
		return fakeMob;
	}
	public void setFakeMob(long fakeMob) {
		this.fakeMob = fakeMob;
	}
	public StudentDTO(int fakeId, String fakeName, String fakeCountry, String fakeMail, long fakeMob) {
		super();
		this.fakeId = fakeId;
		this.fakeName = fakeName;
		this.fakeCountry = fakeCountry;
		this.fakeMail = fakeMail;
		this.fakeMob = fakeMob;
	}
	@Override
	public String toString() {
		return "StudentDTO [fakeId=" + fakeId + ", fakeName=" + fakeName + ", fakeCountry=" + fakeCountry
				+ ", fakeMail=" + fakeMail + ", fakeMob=" + fakeMob + "]";
	}
	public StudentDTO() {
		super();
	}
	
}
