package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.TbItemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 商品业务层接口实现类
 * 
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

	@Override
	public DataGridResult getTbItemList(int page, int rows) {
		// 设置分页信息
		PageHelper.startPage(page, rows);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// 取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);

		// 创建返回结果对象
		DataGridResult result = new DataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);

		return result;

	}

}
