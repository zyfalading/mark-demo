package com.zhao.service.api;

import java.util.List;

import com.zhao.service.pojo.Consumptionrecord;

/**
 * 
 * @ClassName:ConsumPtionrecordService
 * @Description:消费记录公共接口
 * @date:2017年11月16日上午10:54:06 
 * @author zhaoyifei
 * @version V1.0
 */
public interface ConsumPtionrecordService {
	/**
	 * 查询所有消费记录
	 * @return list
	 */
  List<Consumptionrecord> getContAll();
  /**
   * 根据购买时间查询
   * @param buyDate 购买时间
   * @return list
   */
  List<Consumptionrecord> getByTime(String buyDate);
}
