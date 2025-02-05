package org.example.service.configuration;

import feign.Logger;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.jackson.JacksonEncoder;

@Configuration
public class FeignConfiguration {
@Bean
public Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
}
    @Bean
    public Encoder customEncoder () {
        return new JacksonEncoder();
    }
}