package com.chth.springboot.plugin.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: 程泰恒
 * @date: 2019/7/18 14:52
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "springboot.plugin")
public class PluginConfig {

    private String prefix;

    private String suffix;
}
