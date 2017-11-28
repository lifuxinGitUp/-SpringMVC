package com.lanou.test;

import com.lanou.domain.Department;
import com.lanou.mapper.DepartmentMapper;
import com.lanou.service.DepartmentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class MapperTest {

    private ApplicationContext context;
    private DepartmentMapper departmentMapper;
    private DepartmentService departmentService;

    @Before
    public void init() {
        /*启动spring容器*/
        context = new ClassPathXmlApplicationContext("spring-config.xml");
        departmentMapper = (DepartmentMapper) context.getBean("departmentMapper");
        departmentService = (DepartmentService) context.getBean("departmentService");
    }

    @Test
    public void testDepart() {
        System.out.println(departmentMapper);
//        Department depart = departmentMapper.findPostByDepId("2c9090de5f57c640015f57c703bb0004");
//        System.out.println(depart);
//        System.out.println(depart.getPostList());
    }

    @Test
    public void testDepService() {
        List<Department> departments = departmentService.findAll();
        for (Department department : departments) {
            System.out.println(department);
            Department department1 = departmentService.findPostByDepId(department.getDepId());
            if (department1 != null) {
                System.out.println(department1.getDepName() + "部门对应的职务" + department1.getPostList());
            }
        }
    }


}
