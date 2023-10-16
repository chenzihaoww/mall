package com.jlu.mall.ware.dao;

import com.jlu.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-16 16:11:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
