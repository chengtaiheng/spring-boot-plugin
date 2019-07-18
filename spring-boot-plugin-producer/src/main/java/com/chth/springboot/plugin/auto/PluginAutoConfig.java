package com.chth.springboot.plugin.auto;

import com.chth.springboot.plugin.config.PluginConfig;
import com.chth.springboot.plugin.service.PluginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 程泰恒
 * @date: 2019/7/18 15:03
 */

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(PluginConfig.class)
public class PluginAutoConfig {

    @Autowired
    PluginConfig pluginConfig;

    @Bean
    public PluginService pluginService() {
        PluginService pluginService = new PluginService();
        pluginService.setPluginConfig(pluginConfig);
        return pluginService;
    }

}
