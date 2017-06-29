package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 商品业务层接口
 * 
 * @author Administrator
 *
 */

public interface TbItemService {

	/**
	 * 根据商品id查询商品信息
	 */
	TbItem findTbItemById(long id);
}
