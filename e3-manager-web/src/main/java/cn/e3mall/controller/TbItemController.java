package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;

/**
 * 商品表现层
 * 
 * @author Administrator
 *
 */

@Controller
public class TbItemController {

	@Autowired
	private TbItemService tbItemService;

	/**
	 * 根据商品id查询商品信息
	 */
	@RequestMapping("/tbItem/{id}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable long id) {
		TbItem tbItem = tbItemService.findTbItemById(id);
		return tbItem;
	}
	
	/**
	 * 分页查询商品列表
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult getItemList(@RequestParam(defaultValue="1") Integer page,@RequestParam(defaultValue="30") Integer rows) {
		DataGridResult result = tbItemService.getTbItemList(page, rows);
		return result;
	}

}
