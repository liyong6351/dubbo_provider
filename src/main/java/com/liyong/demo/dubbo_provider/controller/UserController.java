package com.liyong.demo.dubbo_provider.controller;

import com.alibaba.fastjson.JSON;
import com.liyong.demo.apis.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>ClassName com.liyong.demo.dubbo_filter.controller.UserController              </p>
 * <p>Description 用户相关的controller                     </p>
 * <p>Author liyong                                  </p>
 * <p>Date 2018-12-29 15:52                           </p>
 * <p>Version 0.0.1                                  </p>
 **/
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list")
    public String getUsers() {
        return JSON.toJSONString(userService.getUsers(1));
    }
}
