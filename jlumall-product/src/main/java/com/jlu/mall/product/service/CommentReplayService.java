package com.jlu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jlu.mall.common.utils.PageUtils;
import com.jlu.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-14 22:35:06
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

