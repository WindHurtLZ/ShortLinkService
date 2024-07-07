package org.myproject.shortlink.admin.config;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bloom Filter Configuration
 */
@Configuration
public class RBloomFilterConfiguration {
    /**
     * Bloom Filter in Redis prevents user from directly query the database
     */
    @Bean
    public RBloomFilter<String> userRegisterCachePenetrationBloomFilter(RedissonClient redissonClient) {
        RBloomFilter<String> cachePenetrationBloomFilter = redissonClient.getBloomFilter("userRegisterBloomFilter");
        cachePenetrationBloomFilter.tryInit(100000000, 0.001);
        return cachePenetrationBloomFilter;
    }
}
