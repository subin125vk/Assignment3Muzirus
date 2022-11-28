package com.example.Assignment3.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "SalutationMst1")
public class SalutationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long salutationid;

	@NotNull
	@Column(name = "code", unique = true, nullable = false)
	private String code;

	@NotNull
	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "genderid", referencedColumnName = "genderid")
	private GenderEntity genderid;

	@NotNull
	@Column(name = "activeyn")
	private Boolean activeyn;

	public long getSalutationid() {
		return salutationid;
	}

	public void setSalutationid(long salutationid) {
		this.salutationid = salutationid;
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
		this.name = name.trim();
	}

	public GenderEntity getGenderid() {
		return genderid;
	}

	public void setGenderid(GenderEntity genderid) {
		this.genderid = genderid;
	}

	public Boolean isActiveyn() {
		return activeyn;
	}

	public void setActiveyn(Boolean activeyn) {
		this.activeyn = activeyn;
	}

	public SalutationEntity(long salutationid, String code, String name, GenderEntity genderid, Boolean activeyn) {
		super();
		this.salutationid = salutationid;
		this.code = code;
		this.name = name;
		this.genderid = genderid;
		this.activeyn = activeyn;
	}

	public SalutationEntity() {
		super();
	}

}
