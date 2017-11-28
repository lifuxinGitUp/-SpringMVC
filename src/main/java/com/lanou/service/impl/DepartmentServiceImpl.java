package com.lanou.service.impl;

import com.lanou.domain.Department;
import com.lanou.mapper.DepartmentMapper;
import com.lanou.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
    @Resource
    private DepartmentMapper departmentMapper;

    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    public Department findPostByDepId(String depId) {
        return departmentMapper.findPostByDepId(depId);
    }
}
