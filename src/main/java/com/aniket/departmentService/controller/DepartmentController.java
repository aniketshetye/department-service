package com.aniket.departmentService.controller;

import com.aniket.departmentService.entity.Department;
import com.aniket.departmentService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveMyDepartment(Department department)
    {

        return departmentService.saveDepartment(department);
    }

    @PostMapping("/{Id}")
    public Department findDepartmentByMyId(Long departmentId)
    {

        return departmentService.findDepartmentById(departmentId);
    }

}
