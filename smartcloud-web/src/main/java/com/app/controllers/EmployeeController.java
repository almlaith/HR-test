package com.app.controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.webstack.controllers.JKManagedBeanWithOrmSupport;
import com.app.entities.Employee;
@ManagedBean(name = "mbEmployee")
@ViewScoped
public class EmployeeController extends JKManagedBeanWithOrmSupport<Employee> {
}