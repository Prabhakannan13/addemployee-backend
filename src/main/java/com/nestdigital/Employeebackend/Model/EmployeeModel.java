package com.nestdigital.Employeebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String address;
    private String bloodgroup;
    private String company;
    private int employeecode;
    private String dateofjoining;

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public String getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(String dateofjoining) {
        this.dateofjoining = dateofjoining;
    }

    public EmployeeModel(int id, String name, String email, String address, String bloodgroup, String company, int employeecode, String dateofjoining) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.bloodgroup = bloodgroup;
        this.company = company;
        this.employeecode = employeecode;
        this.dateofjoining = dateofjoining;
    }
}
