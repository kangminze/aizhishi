package com.kxz.aizhishi.usermanage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class UserInfoE implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8866157628652072961L;

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="user_name",nullable=true)
	private String username;
	
	@Column(name="pass_word",nullable=true)
	private String passwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "UserInfoE [id=" + id + ", username=" + username + ", passwd="
				+ passwd + "]";
	}

}
