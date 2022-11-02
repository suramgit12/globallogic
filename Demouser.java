package com.gl.cryptoUsers.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class Demouser extends User{
	@Id
	private String username;
	private String password;
	private String type;
	public Demouser() {
		super("Marigold","Mango",new ArrayList<>());
	}
	
	public Demouser(String username, String password,String type, Collection<? extends GrantedAuthority> authorities,String username2, String password2,String type2) {
		super(username, password, authorities);
		username=username2;
		password=password2;
		type=type2;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
