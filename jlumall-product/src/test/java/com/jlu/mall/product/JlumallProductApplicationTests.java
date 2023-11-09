package com.jlu.mall.product;

import com.jlu.mall.product.entity.BrandEntity;
import com.jlu.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.UUID;

@SpringBootTest
class JlumallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedissonClient redissonClient;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(13L);
        brandEntity.setDescript("小米");
        brandService.save(brandEntity);
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }
    @Test
    void teststringRedisTemplate() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello","world"+ UUID.randomUUID().toString());

        // 查询
        String hello = ops.get("hello");
        System.out.println("之前保存的数据："+hello);
    }

    @Test
    public void redisson(){
        System.out.println(redissonClient);
    }

}
