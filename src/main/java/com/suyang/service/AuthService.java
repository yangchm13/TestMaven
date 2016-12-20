package com.suyang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suyang.dao.AuthMapper;
import com.suyang.model.Auth;


@Service
public class AuthService {
	
	@Autowired
	public AuthMapper authMapper;
	
	public List<Auth> getAuthList(){
		return authMapper.getAuthList();
	}

	public void addAdmin(Auth auth) {
		// TODO Auto-generated method stub
		
	}

	public void updateAdmin(Auth auth) {
		// TODO Auto-generated method stub
		
	}

	public Auth getAuthById(Long authId) {
		return authMapper.getAuthById(authId);
	}
}
