package com.example.demo001;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo001.entity.User;
import com.example.demo001.service.impl.RoleServiceImpl;
import com.example.demo001.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author Snow
 * @create 2021-08-19 10:15
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RoleServiceImpl roleService;

    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUsername("Admin");
        user.setPassword("Admin");
        user.setAge(18);
        user.setEmail("hsyy@qq.com");

        //插入一个用户
        boolean save = userService.save(user);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .eq("username", "Admin")
                .eq("password", "Admin");
        Map<String, Object> map = userService.getMap(wrapper);

    }

    @Test
    public void test1() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .eq("username", "Admin")
                .eq("password", "Admin");
        User one = userService.getOne(wrapper);
        System.out.println(one);

    }
}
