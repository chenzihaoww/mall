package com.jlu.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jlu.mall.common.utils.PageUtils;
import com.jlu.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-16 00:32:03
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

