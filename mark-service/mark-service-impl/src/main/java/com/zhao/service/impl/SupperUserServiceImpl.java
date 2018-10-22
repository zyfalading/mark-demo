package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.service.api.SupperUserService;
import com.zhao.service.mapper.SupperuserMapper;
import com.zhao.service.pojo.Supperuser;
import com.zhao.service.pojo.SupperuserExample;


/**
 * 
 * @author DELL
 * 实现层
 */
@Service("supperUserService")
public class SupperUserServiceImpl implements SupperUserService{
	@Autowired
	private SupperuserMapper suMapper;

	@Override
	public List<Supperuser> getUserAll() {
		SupperuserExample suExample = new SupperuserExample();
		return suMapper.selectByExample(suExample);
	}
	

}
