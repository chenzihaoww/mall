package com.jlu.mall.order.dao;

import com.jlu.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-16 00:32:03
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
