package cn.e3mall.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;

/**
 * 商品管理Service
 * @author m
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	// 逆向工程生成的mapper
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(Long timeId) {
		// 根据主键查询
		// TbItem item = itemMapper.selectByPrimaryKey(timeId);
		
		// 设置查询条件
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(timeId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
