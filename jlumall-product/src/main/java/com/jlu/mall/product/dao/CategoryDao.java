package com.jlu.mall.product.dao;

import com.jlu.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-14 22:35:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}