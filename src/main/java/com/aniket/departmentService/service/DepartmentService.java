package com.aniket.departmentService.service;

import com.aniket.departmentService.entity.Department;
import com.aniket.departmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
   private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long department) {
        return departmentRepository.findByDepartmentId(department);
    }
}
