package com.gl.cryptoUsers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.cryptoUsers.bean.Demouser;
import com.gl.cryptoUsers.dao.DemouserRepository;


@Service
public class DemouserService  implements UserDetailsService{
	@Autowired
	private DemouserRepository repository;
	private String type;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Demouser users= repository.findById(username).get();
		type=users.getType();
		return users;
	}
	public void save(Demouser users) {
		 repository.save(users);
	 }
	public String getType()
	{
		return type;
	}


}
