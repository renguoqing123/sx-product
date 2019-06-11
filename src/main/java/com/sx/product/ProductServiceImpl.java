package com.sx.product;

import com.sx.product.service.ProductService;

public class ProductServiceImpl implements ProductService{

	public String getProductById(Integer id) {
		System.out.println("调用成功==id:"+id);
		return "OK";
	}

}
