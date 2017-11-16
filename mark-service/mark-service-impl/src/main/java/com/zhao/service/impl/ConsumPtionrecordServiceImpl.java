package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.service.api.ConsumPtionrecordService;
import com.zhao.service.mapper.ConsumptionrecordMapper;
import com.zhao.service.pojo.Consumptionrecord;
import com.zhao.service.pojo.ConsumptionrecordExample;

/**
 * 
 * @ClassName:ConsumPtionrecordServiceImpl
 * @Description:购买记录接口实现
 * @date:2017年11月16日上午11:15:46 
 * @author zhaoyifei
 * @version V1.0
 */
@Service("consumPtionrecordService")
public class ConsumPtionrecordServiceImpl implements ConsumPtionrecordService {
	@Autowired
	private ConsumptionrecordMapper consumptionrecordMapper;
	@Override
	public List<Consumptionrecord> getContAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Consumptionrecord> getByTime(String buyDate) {
		ConsumptionrecordExample conpExample = new ConsumptionrecordExample();
		conpExample.createCriteria().andBuydateEqualTo(buyDate);
		return consumptionrecordMapper.selectByExample(conpExample);
	}

}
