package com.jlu.mall.product;

import com.jlu.mall.product.entity.BrandEntity;
import com.jlu.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JlumallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(13L);
        brandEntity.setDescript("小米");
        brandService.save(brandEntity);
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }

}
