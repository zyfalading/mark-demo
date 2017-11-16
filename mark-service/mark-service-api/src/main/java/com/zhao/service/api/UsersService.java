package com.zhao.service.api;

import java.util.List;

import com.zhao.service.pojo.Users;

/**
 * 
 * @ClassName:UsersService
 * @Description:用户接口
 * @date:2017年11月16日上午11:02:50 
 * @author zhaoyifei
 * @version V1.0
 */
public interface UsersService {
	/**
	 * 示例
	 * List<T> getName(Sring t);
	 */
	List<Users> getUAll();
	
	String updateUser(Users users);
}
