package com.zhao.service.api;

import java.util.List;

import com.zhao.service.pojo.Shop;

/**
 * 
 * @ClassName:ShopService
 * @Description:公共商品接口
 * @date:2017年11月16日上午10:59:18 
 * @author zhaoyifei
 * @version V1.0
 */
public interface ShopService {

	/**
	 * 示例
	 * List<T> getName(String t);
	 */
	List<Shop> getShopAll();
}
