package com.francis.starter.configuration;

import com.francis.starter.FormatTemplate;
import com.francis.starter.format.FormatProcessor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author Francis
 * @Date 2021/4/24 19:31
 * @Version 1.0
 * @Description:
 */
@Import({FormatAutoConfiguration.class})
@EnableConfigurationProperties(FrancisProperties.class)
@Configuration
public class FrancisAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FrancisProperties francisProperties, FormatProcessor formatProcessor){
        return new FormatTemplate(francisProperties,formatProcessor);
    }

}
