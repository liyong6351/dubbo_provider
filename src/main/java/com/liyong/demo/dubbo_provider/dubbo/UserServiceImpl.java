package com.liyong.demo.dubbo_provider.dubbo;


import com.liyong.demo.apis.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName com.liyong.demo.dubbo_filter.dubbo.UserServiceImpl              </p>
 * <p>Description dubbo用户服务的实现                     </p>
 * <p>Author liyong                                  </p>
 * <p>Date 2018-12-29 15:48                           </p>
 * <p>Version 0.0.1                                  </p>
 **/
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = UserService.class)
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getUsers(Integer type) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("helloworld" + i);
        }
        return list;
    }
}
