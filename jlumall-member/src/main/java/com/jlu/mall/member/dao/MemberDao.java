package com.jlu.mall.member.dao;

import com.jlu.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cesarz
 * @email chenzihaoww@gmail.com
 * @date 2023-10-16 00:08:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
