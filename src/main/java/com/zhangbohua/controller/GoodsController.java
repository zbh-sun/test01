package com.zhangbohua.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.zhangbohua.bean.Brand;
import com.zhangbohua.bean.Goods;
import com.zhangbohua.bean.Kind;
import com.zhangbohua.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService gs;
	
	@RequestMapping({"findList","/"})
	private String findList(@RequestParam(defaultValue="1")Integer pageNum,Model m,Goods goods){
	PageInfo<Goods> list = gs.findList(pageNum, goods);
		m.addAttribute("page",list);
		return "List";
	}
	@RequestMapping("query")
	@ResponseBody
	private Map<String, Object> query(){
		List<Brand> b = gs.queryB();
		List<Kind> k = gs.queryK();
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("brand", b);
		map.put("kind", k);
		
		return map;
	}
	
	@RequestMapping("add")
	private String add(MultipartFile file){
		Integer add = gs.add();
		if(add!=null){
			return "redirect:findList";
		}
		return "redirect:findList";
	}
}
