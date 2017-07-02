package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * 
 * @author Administrator
 *
 */

@Controller
public class PageController {

	/**
	 * 跳转首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	/**
	 * 跳转商品列表页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPages(@PathVariable String page){
		return page;
	}
	
	
}
