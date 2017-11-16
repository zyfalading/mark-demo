package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.service.api.UsersService;
import com.zhao.service.mapper.UsersMapper;
import com.zhao.service.pojo.Users;

/**
 * 
 * @ClassName:UsersServiceImpl
 * @Description:用户接口实现
 * @date:2017年11月16日上午11:14:39 
 * @author zhaoyifei
 * @version V1.0
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersMapper usersMapper;
	@Override
	public List<Users> getUAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateUser(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKey(users)>0?"修改成功":"修改失败";
	}

}
