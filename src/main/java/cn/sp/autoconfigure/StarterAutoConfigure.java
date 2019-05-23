package cn.sp.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 2YSP on 2019/5/22.
 */
@Configuration
@ConditionalOnClass(StarterService.class)
//@ConditionalOnProperty(prefix = "cn.sp",value = "enable",matchIfMissing = true)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "cn.sp",value = "enabled",havingValue = "true")
    StarterService starterService(){
        return new StarterService(properties.getConfig());
    }

}
