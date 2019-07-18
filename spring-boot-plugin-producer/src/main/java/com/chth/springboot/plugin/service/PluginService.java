package com.chth.springboot.plugin.service;

import com.chth.springboot.plugin.config.PluginConfig;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: 程泰恒
 * @date: 2019/7/18 14:54
 */


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class PluginService {

    PluginConfig pluginConfig;

    /**
     * 插件方法
     *
     * @param name
     * @return
     */
    public String saySomeThing(String name) {

        val prefix = pluginConfig.getPrefix();
        val suffix = pluginConfig.getSuffix();

        log.debug("prefix:{}", prefix);
        log.debug("suffix:{}", suffix);

        return prefix + "-" + name + "-" + suffix;
    }

}
