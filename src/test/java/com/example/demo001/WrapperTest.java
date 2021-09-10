/*
package com.example.demo001;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

*/
/**
 * @author Snow
 * @create 2021-08-18 15:51
 * <p>
 * 查询name不为空、邮箱不为空、年龄大于等于十二岁的用户
 * <p>
 * 名字等于Tom
 * 名字不包含e的
 * 年龄在20~30之间的用户的数量
 * <p>
 * 子查询
 * <p>
 * 排序
 *//*

@SpringBootTest
public class WrapperTest {

    @Autowired
    private UserMapper userMapper;

    */
/**
 * 查询name不为空、邮箱不为空、年龄大于等于十二岁的用户
 *//*

    @Test
    public void test1() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper
                .isNotNull("name")
                .isNotNull("email")
                .ge("age", 12);
        userMapper.selectList(wrapper).forEach(System.out::println);
    }


    */
/**
 * 名字等于Tom
 * 名字不包含e的
 * 年龄在20~30之间的用户的数量
 *//*

    @Test
    public void test2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        名字等于Tom
//        wrapper.eq("name", "Tom");

//        年龄在20~30之间的用户的数量
//        wrapper.between("age", 20, 30);
//        Integer integer = userMapper.selectCount(wrapper);
//        System.out.println(integer);

        //名字不包含e的
//        wrapper.notLike("name", "e");

        //名字包含e的
//        wrapper.like("name", "e");

        //以T开头的  LikeRight代表%%在右边
        wrapper.likeRight("name", "T");


        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    */
/**
 * 子查询
 *//*

    @Test
    public void test3() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.le("id", 1)
                .inSql("id", "select id from user where id < 3");

        userMapper.selectObjs(wrapper).forEach(System.out::println);
    }


    */
/**
 * 排序
 *//*

    @Test
    public void test4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        wrapper.orderByDesc("name");
        userMapper.selectList(wrapper).forEach(System.out::println);
    }

}
*/
