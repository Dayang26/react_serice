package com.example.demo001.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo001.entity.User;
import com.example.demo001.service.UserService;
import com.example.demo001.service.impl.UserServiceImpl;
import com.example.demo001.utils.JsonResult;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import org.apache.ibatis.logging.jdbc.ConnectionLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Snow
 * @since 2021-08-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public Object Login(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .eq("username", user.getUsername())
                .eq("password", user.getPassword());
        try {
            User one = userService.getOne(wrapper);
            if (one != null) {
                return new JsonResult(one);
            } else {
                return new JsonResult(403, "账号或密码错误！");
            }
        } catch (Exception ignored) {
            return new JsonResult(500, "查询错误！");
        } 

    }

}

