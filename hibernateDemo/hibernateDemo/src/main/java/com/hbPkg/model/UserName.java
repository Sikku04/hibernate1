package com.hbPkg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserName {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String fName;
	private String mName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "UserName [fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}

}
