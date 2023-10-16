package com.jlu.mall.coupon.dao;

import com.jlu.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-15 23:42:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
