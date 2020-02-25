package com.zhangbohua.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangbohua.bean.Brand;
import com.zhangbohua.bean.Goods;
import com.zhangbohua.bean.Kind;

public interface GoodsService {
	//查找
		PageInfo<Goods> findList(Integer pageNum,Goods goods);
		//下拉框
		List<Brand> queryB();
		List<Kind> queryK();
		Integer add();
		
}
