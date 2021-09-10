package com.example.demo001.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.demo001.entity.User;
import com.example.demo001.mapper.UserMapper;
import com.example.demo001.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Snow
 * @since 2021-08-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 插入一条记录（选择字段，策略插入）
     *
     * @param entity 实体对象
     */
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     */
    @Override
    public List<User> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }


    @Override
    public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
        return super.getMap(queryWrapper);
    }
}
