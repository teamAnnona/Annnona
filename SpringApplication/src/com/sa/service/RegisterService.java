package com.sa.service;

import com.sa.command.RegisterCommand;
import com.sa.dao.RegisterDao;
import com.sa.hlo.RegisterBo;

public class RegisterService {
	private RegisterDao registerDao;

	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}
	
	public String insert(RegisterCommand registerCommand){
			RegisterBo registerBo=new RegisterBo();
			registerBo.setFirstName(registerCommand.getFirstName());
			registerBo.setSecondName(registerCommand.getSecondName());
			registerBo.setMobile(registerCommand.getMobile());
			registerBo.setEmail(registerCommand.getEmail());
			registerBo.setAddress(registerCommand.getAddress());
			registerBo.setMaritalstatus(registerCommand.getMaritalstatus());
			registerBo.setAlternativeemail(registerCommand.getAlternativeemail());
			registerBo.setCitizenship(registerCommand.getAlternativeemail());
			
			registerDao.inert(registerBo);
		return "success";
	}
public String Edit(RegisterCommand registerCommand){
	RegisterBo registerBo = new RegisterBo();
	
}
}
