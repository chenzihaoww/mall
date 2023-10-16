package com.jlu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jlu.mall.common.utils.PageUtils;
import com.jlu.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-14 22:35:06
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

