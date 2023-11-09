package com.jlu.mall.product.service.impl;

import com.alibaba.fastjson.TypeReference;
import com.jlu.mall.common.utils.R;
import com.jlu.mall.product.dao.SkuInfoDao;
import com.jlu.mall.product.entity.SkuInfoEntity;
import com.jlu.mall.product.entity.SpuInfoDescEntity;
import com.jlu.mall.product.feign.SeckillFeignService;
import com.jlu.mall.product.service.*;
import com.jlu.mall.product.vo.SeckillSkuVo;
import com.jlu.mall.product.vo.SkuItemSaleAttrVo;
import com.jlu.mall.product.vo.SkuItemVo;
import com.jlu.mall.product.vo.SpuItemAttrGroupVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jlu.mall.common.utils.PageUtils;
import com.jlu.mall.common.utils.Query;

import com.jlu.mall.product.dao.SkuImagesDao;
import com.jlu.mall.product.entity.SkuImagesEntity;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<SkuImagesEntity> getImagesBySkuId(Long skuId) {

        List<SkuImagesEntity> imagesEntities = this.baseMapper.selectList(new QueryWrapper<SkuImagesEntity>().eq("sku_id", skuId));

        return imagesEntities;
    }

}