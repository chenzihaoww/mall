package com.jlu.mall.ware.feign;

import com.jlu.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("jlumall-gateway")
public interface ProductFeignService {

    /**
     *      /product/skuinfo/info/{skuId}
     *   1)、让所有请求过网关；
     *          1、@FeignClient("jlumall-gateway")：jlumall-gateway所在的机器发请求
     *          2、/api/product/skuinfo/info/{skuId}
     *   2）、直接让后台指定服务处理
     *          1、@FeignClient("jlumall-product")
     *          2、/product/skuinfo/info/{skuId}
     *
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId);
}
