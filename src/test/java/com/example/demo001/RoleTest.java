package com.example.demo001;

import com.example.demo001.entity.Role;
import com.example.demo001.service.impl.RoleServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Snow
 * @create 2021-08-19 9:42
 */
@SpringBootTest
public class RoleTest {
    @Autowired
    private RoleServiceImpl roleService;

    @Test
    public void saveRole() {
        Role role = new Role();
        role.setRoleName("operator");
        role.setRoleDescription("员工");
        boolean save = roleService.save(role);
        System.out.println(save);
    }


    @Test
    public void test() {
        List<Role> list = roleService.list();
        list.forEach(System.out::println);
    }
}
