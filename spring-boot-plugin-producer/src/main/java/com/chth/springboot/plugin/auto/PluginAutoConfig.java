package com.chth.springboot.plugin.auto;

import com.chth.springboot.plugin.service.PluginService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PrivateKey;

/**
 * @author: 程泰恒
 * @date: 2019/7/18 15:03
 */

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(PluginAutoConfig.PluginConfig.class)
@ConditionalOnProperty(
    prefix = "springboot.plugin",  //前缀
    name = {"enabled"},             //属性名
    havingValue = "true",           //生效的条件
    matchIfMissing = true           //加入没有上面指定的属性的默认值
)
public class PluginAutoConfig {

    @Autowired
    PluginConfig pluginConfig;

    @Bean
    public PluginService pluginService() {
        PluginService pluginService = new PluginService();
        pluginService.setPluginConfig(pluginConfig);
        return pluginService;
    }


    @ConfigurationProperties(prefix = "springboot.plugin")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static final class PluginConfig{

        private boolean enable = true;

        private String prefix;

        private String suffix;
    }



}
