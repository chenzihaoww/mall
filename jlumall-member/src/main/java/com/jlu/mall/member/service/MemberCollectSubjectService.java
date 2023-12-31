package com.jlu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jlu.mall.common.utils.PageUtils;
import com.jlu.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-16 00:08:34
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

