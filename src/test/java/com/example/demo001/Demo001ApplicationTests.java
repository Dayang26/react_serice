/*
package com.example.demo001;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo001.mapper.UserMapper;
import com.example.demo001.vo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class Demo001ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }


    @Test
    public void insertUserTest() {
        User user = new User();
        user.setId(11L);
        user.setName("john");
        user.setAge(123);
        user.setEmail("test1111@baomidou.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }


    */
/**
     * 乐观锁成功案例
     *//*

    @Test
    public void InterceptorTestSucceed() {
        //查询用户信息
        User user = userMapper.selectById(10L);
        System.out.println(user);
        //修改用户信息
        user.setName("jon");
        userMapper.updateById(user);
    }

    */
/**
     * 乐观锁失败案例
     *//*

    @Test
    public void InterceptorTestFail() {
        User user = userMapper.selectById(10L);
        user.setName("jon132");


        User user1 = userMapper.selectById(10L);
        user1.setName("jonlll");
        userMapper.updateById(user1);

        userMapper.updateById(user);

    }

    */
/**
     * 批量查询用户
     *//*

    @Test
    public void queryTest() {
//        Arrays 是工具类;
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }

    */
/**
     * 通过Id查询用户
     *//*

    @Test
    public void queryById(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    */
/**
     * 条件查询
     *//*

    @Test
    public void testSelectByBatchIds() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Miller");
        map.put("email", "test9@baomidou.com");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }


    */
/**
     * 分页查询
     *//*

    @Test
    public void selectPage() {
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);
        System.out.println("@@@" + page.getSize());
        System.out.println("@@@" + page.getTotal());
        System.out.println("@@@" + page.getCurrent());
    }


    */
/**
     * 删除方法测试
     *//*

    @Test
    public void deleteById() {
        int i = userMapper.deleteById(2L);
        System.out.println(i);

//        User user = new User();
//        user.setId(9L);
//        user.setName("");
//        int i = userMapper.deleteBatchIds(Arrays.asList(9, 8, 7, 6));
//        System.out.println(i);
    }
}
*/
