package com.sa.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sa.hlo.RegisterBo;

public class RegisterDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public String inert(RegisterBo registerBo){
		hibernateTemplate.save(registerBo);
		return "success";
	}
	public String edit(RegisterBo registerBo){
		hibernateTemplate.update(registerBo);
		return "success";
	}
	public RegisterBo findById(int id)
	{
		return (RegisterBo)hibernateTemplate.load(RegisterBo.class, id);
	}

}
