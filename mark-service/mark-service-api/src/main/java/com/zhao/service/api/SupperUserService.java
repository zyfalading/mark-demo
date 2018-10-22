package com.zhao.service.api;

import java.util.List;

import com.zhao.service.pojo.Supperuser;


/**
 * 
 * @author DELL
 *
 */
public interface SupperUserService {
  /**
   * 查询所有用户
   * @return
   */
	List<Supperuser> getUserAll();
	
}
