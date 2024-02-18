package com.heapsteep.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigSpringCache {

    @Bean CacheManager EhcacheManager_2(){
        return new ConcurrentMapCacheManager("cacheStore");
    }
}

