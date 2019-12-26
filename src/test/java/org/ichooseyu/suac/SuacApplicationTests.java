package org.ichooseyu.suac;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("redis,jpa,mysql")//单元测试中添加profiles
class SuacApplicationTests {
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    void testRedis() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("k1", "v1");
        Object k1 = ops.get("k1");
        System.out.println(k1);
    }

}
