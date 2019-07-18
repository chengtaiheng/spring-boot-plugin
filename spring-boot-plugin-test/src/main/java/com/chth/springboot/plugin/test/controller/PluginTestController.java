package com.chth.springboot.plugin.test.controller;

import com.chth.springboot.plugin.service.PluginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 程泰恒
 * @date: 2019/7/18 15:17
 */


@RestController
@RequestMapping("/plugin")
public class PluginTestController {
    @Autowired
    PluginService pluginService;

    @GetMapping("/test")
    public String testPlugin(@RequestParam("name") String name) {
        return pluginService.saySomeThing(name);
    }
}
