package com.solo.erp.controller.config;

import com.solo.erp.common.utils.SnowflakeIdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
    @Bean
    SnowflakeIdWorker snowflakeIdWorker() {
        SnowflakeIdWorker worker = new SnowflakeIdWorker(0, 0);
        return worker;
    }
}
