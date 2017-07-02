package cn.e3mall.PageHelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * PageHelper测试类
 * 
 * @author Administrator
 *
 */
public class TestPageHelper {

	@Test
	public void testPageHelper() {
		// 设置分页信息
		PageHelper.startPage(1, 10);
		// 执行查询
		// 初始化容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-dao.xml");
		// 从spring容器中获得mapper代理对象
		TbItemMapper tbItemMapper = applicationContext
				.getBean(TbItemMapper.class);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// 获取分页结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		System.out.println("查询结果总记录数"+pageInfo.getTotal());
		System.out.println("查询总页数"+pageInfo.getPages());
		System.out.println("查询当前页"+pageInfo.getPageNum());
		System.out.println("每页显示数据数"+pageInfo.getPageSize());

	}
}
