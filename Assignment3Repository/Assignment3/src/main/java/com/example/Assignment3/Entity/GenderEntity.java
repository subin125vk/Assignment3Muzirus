package com.example.Assignment3.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GenderMst1")
public class GenderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genderid")
	private long genderid;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	public long getGenderid() {
		return genderid;
	}

	public void setGenderid(long genderid) {
		this.genderid = genderid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
