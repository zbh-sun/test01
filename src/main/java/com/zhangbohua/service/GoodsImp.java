package com.zhangbohua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangbohua.bean.Brand;
import com.zhangbohua.bean.Goods;
import com.zhangbohua.bean.Kind;
import com.zhangbohua.mapper.GoodsMapper;
@Service
public class GoodsImp implements GoodsService{

	@Autowired
	GoodsMapper goodMapper;

	public List<Brand> queryB() {
		// TODO Auto-generated method stub
		return goodMapper.queryB();
	}

	public List<Kind> queryK() {
		// TODO Auto-generated method stub
		return goodMapper.queryK();
	}

	public PageInfo<Goods> findList(Integer pageNum, Goods goods) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,3);
		return new PageInfo<Goods>(goodMapper.findList(goods));
	}

	public Integer add() {
		// TODO Auto-generated method stub
		return null;
	}

}
