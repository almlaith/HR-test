package com.app.controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.webstack.controllers.JKManagedBeanWithOrmSupport;
import com.app.entities.Department;
@ManagedBean(name = "mbDepartment")
@ViewScoped
public class DepartmentController extends JKManagedBeanWithOrmSupport<Department> {
}