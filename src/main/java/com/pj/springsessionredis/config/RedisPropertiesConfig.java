package com.pj.springsessionredis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisPropertiesConfig
{
    private String host;
    private String password;
    private Integer port;
}
