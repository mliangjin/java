package com.e3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3.mapper.TbItemMapper;
import com.e3.pojo.TbItem;
import com.e3.pojo.TbItemExample;
import com.e3.pojo.TbItemExample.Criteria;
import com.e3.service.ItemService;

/**
 * 商品管理Service
 * Title: TtemServiceImpl
 * @version 1.0
 *
 */

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		// 根据主键查询
		// TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		// return tbItem;
		
		// 根据条件查询
		TbItemExample example = new TbItemExample();
		Criteria criteria =	example.createCriteria();
		// 查询条件
		criteria.andIdEqualTo(itemId);
		// 执行查询
		List<TbItem> list = itemMapper.selectByExample(example);
		
		if (list != null && list.size() > 0) {
			return list.get(0);
		}else {
			return null;
		}
	}

}
