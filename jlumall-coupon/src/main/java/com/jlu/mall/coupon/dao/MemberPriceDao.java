package com.jlu.mall.coupon.dao;

import com.jlu.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-15 23:42:26
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
