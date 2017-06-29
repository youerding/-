package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;
/**
 * 商品业务层接口实现类
 * @author Administrator
 *
 */

@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findTbItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
