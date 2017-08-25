package cn.ums.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.ums.ssm.po.Items;
import cn.ums.ssm.po.ItemsCustom;
import cn.ums.ssm.po.ItemsExample;
import cn.ums.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}