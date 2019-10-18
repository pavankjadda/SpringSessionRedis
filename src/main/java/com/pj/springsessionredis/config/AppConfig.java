package com.pj.springsessionredis.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    private final RedisPropertiesConfig redisPropertiesConfig;

    public AppConfig(RedisPropertiesConfig redisPropertiesConfig)
    {
        this.redisPropertiesConfig = redisPropertiesConfig;
    }

/*
    @Bean
    public LettuceConnectionFactory connectionFactory()
    {
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration(redisPropertiesConfig.getHost(),
                redisPropertiesConfig.getPort()));
    }
*/
}
