package com.nestdigital.Employeebackend.Dao;

import com.nestdigital.Employeebackend.Model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployeeById(Integer id);

    @Query(value = "SELECT `id`, `address`, `bloodgroup`, `company`, `dateofjoining`, `email`, `employeecode`, `name` FROM `employee` WHERE `name`=:name",nativeQuery = true)
    List<EmployeeModel>searchemployee(String name);
}
