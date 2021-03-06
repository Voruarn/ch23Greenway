package com.controller.before;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Auser;
import com.po.Goods;
import com.service.before.IndexService;


@Controller
public class IndexController {
	@Autowired
	private IndexService indexService;
	
	//首页
	@RequestMapping("/before")
	public String before(Model model,HttpSession session,Goods goods) {
		return indexService.before(model, session, goods);
	}
	
	//转到注册页面
	@RequestMapping("/toRegister")
	public String toRegister(Model model) {
		return indexService.toRegister(model);
	}
	
	//转到登录页面
	@RequestMapping("/toLogin")
	public String toLogin(Model model) {
		return indexService.toLogin(model);
	}
	
	//转到商品详情页
	@RequestMapping("/goodsDetail")
	public String goodsDetail(Model model,Integer id) {
		return indexService.goodsDetail(model, id);
	}
	
	//首页搜索
	@RequestMapping("/search")
	public String search(Model model,String mykey) {
		return indexService.search(model, mykey);
	}
	
	@RequestMapping("/before/exit")
	public String beforeExit(Model model,HttpSession session) {
		session.invalidate();
		return "before/login";
	}
	
	@RequestMapping("/toCompIntro")
	public String toCompIntro(Model model,HttpSession session) {
		return "before/compIntro";
	}
	
	@RequestMapping("/toContactUs")
	public String toContactUs(Model model,HttpSession session) {
		return "before/contactUs";
	}
	
	@RequestMapping("/toMain")
	public String toMain(Model model,HttpSession session) {
		return "before/mainPage";
	}
	
	@RequestMapping("/toNewsInfo")
	public String toNewsInfo(Model model,HttpSession session) {
		return "before/newsInfo";
	}
	
	
	@RequestMapping("/toShowProd")
	public String toShowProd(Model model,HttpSession session,Goods goods) {
		return indexService.before(model, session, goods);
	}
	
}
