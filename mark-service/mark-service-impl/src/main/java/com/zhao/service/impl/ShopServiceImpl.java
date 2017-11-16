package com.zhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhao.service.api.ShopService;
import com.zhao.service.mapper.ShopMapper;
import com.zhao.service.pojo.Shop;

/**
 * 
 * @ClassName:ShopServiceImpl
 * @Description:商品接口实现
 * @date:2017年11月16日上午11:13:55 
 * @author zhaoyifei
 * @version V1.0
 */
@Service("shopService")
public class ShopServiceImpl  implements ShopService{
	@Autowired
	private ShopMapper shopMapper;
	
	@Override
	public List<Shop> getShopAll() {
		// TODO Auto-generated method stub
		return shopMapper.selectByExample(null);
	}

}
