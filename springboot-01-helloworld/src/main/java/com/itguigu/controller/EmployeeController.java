package com.itguigu.controller;

import com.itguigu.dao.EmployeeDao;
import com.itguigu.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author Haoming Chen
 * Created on 2019/8/12
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    //查询所有员工,返回列表页面
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps", employees);
        //thymeleaf默认就会拼串
        //classpath:/templates/xxxx.html
        return "emp/list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(){
        //来到添加页面
        return "emp/add";
    }
}
