package com.zhao.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhao.service.api.ShopService;
import com.zhao.service.pojo.Shop;
@Controller
public class ShopController {
	@Autowired
	private ShopService shopService;
	@RequestMapping("/showshop")
	@ResponseBody
	public List<Shop> showShop(){
		List<Shop> shops = shopService.getShopAll();
		return shops;
	}
}
