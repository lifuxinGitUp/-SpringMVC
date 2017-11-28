package com.lanou.mapper;

import com.lanou.domain.Department;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public interface DepartmentMapper {
    /**
     * 查询所有
     * @return 所有部门
     */
    List<Department> findAll();

    /**
     * 根据id查询部门对象
     * @param depId 要查询的部门id
     */
    Department findById(String depId);

    /**
     * 根据部门id查询带职务集合的部门对象
     * @param depId 要查询的部门id
     */
    Department findPostByDepId(String depId);
}
