package com.example.demo001.service.impl;

import com.example.demo001.entity.Role;
import com.example.demo001.mapper.RoleMapper;
import com.example.demo001.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Snow
 * @since 2021-08-19
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    /**
     * 插入一条记录（选择字段，策略插入）
     *
     * @param entity 实体对象
     */
    @Override
    public boolean save(Role entity) {
        return super.save(entity);
    }

    /**
     * 查询所有
     */
    @Override
    public List<Role> list() {
        return super.list();
    }
}
