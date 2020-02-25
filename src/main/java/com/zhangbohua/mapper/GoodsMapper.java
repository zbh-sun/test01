package com.zhangbohua.mapper;

import java.util.List;

import com.zhangbohua.bean.Brand;
import com.zhangbohua.bean.Goods;
import com.zhangbohua.bean.Kind;

public interface GoodsMapper {
	//查找
	List<Goods> findList(Goods goods);
	//下拉框
	List<Brand> queryB();
	List<Kind> queryK();
	Integer add();
	
}
