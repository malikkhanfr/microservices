package com.zrtech.com.department.service;

import com.zrtech.com.department.entity.Department;
import com.zrtech.com.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside the saveDepartment of the service repository");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside the findDepartmentById of the service repository");
        return departmentRepository.findByDepartmentId(departmentId);

    }
}
