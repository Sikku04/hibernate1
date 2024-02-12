package com.hbPkg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private UserName userName;
	private String nameColor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserName getUserName() {
		return userName;
	}

	public void setUserName(UserName userName) {
		this.userName = userName;
	}

	public String getNameColor() {
		return nameColor;
	}

	public void setNameColor(String nameColor) {
		this.nameColor = nameColor;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", nameColor=" + nameColor + "]";
	}

}
