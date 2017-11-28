package com.lanou.controller;

import com.lanou.domain.Department;
import com.lanou.domain.Post;
import com.lanou.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */

/**
 * 在类上面定义的@RequestMapping注解代表该类中的所有方法前都需要加的路径,
 * 相当于struts2中的package
 **/
@Controller
@RequestMapping("/hr")
public class DepartmentController {
    @Qualifier("departmentService")
    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询部门集合
     * 返回json数据
     * 访问地址:/hr/findAll
     **/
    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Department> findAll() {
        /*调用业务层获取部门集合*/

//       List<Department> departments = departmentService.findAll();
//        System.out.println("1111"+departmentService.findAll());
        return departmentService.findAll();

    }

    /**
     * 根据部门id查询职务集合
     * 返回json数据
     * 访问地址:/hr/findPostByDepId
     **/
    @ResponseBody
    @RequestMapping(value = "/findPostsByDepId")
    public List<Post> findPostByDepId(String depId) {
        System.out.println("要查找的部门id" + depId);
        Department department = departmentService.findPostByDepId(depId);
        if (department != null) {
            return department.getPostList();
        } else {
            return null;
        }
    }

}
