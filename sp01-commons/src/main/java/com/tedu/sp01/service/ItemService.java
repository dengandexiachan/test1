package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);//通过订单id来获取商品列表
	void decreaseNumbers(List<Item> list);//在保存订单时。
}
