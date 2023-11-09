package com.jlu.mall.product.fallback;

import com.jlu.mall.common.exception.BizCodeEnume;
import com.jlu.mall.common.utils.R;
import com.jlu.mall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;



@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnume.TO_MANY_REQUEST.getCode(), BizCodeEnume.TO_MANY_REQUEST.getMessage());
    }
}
