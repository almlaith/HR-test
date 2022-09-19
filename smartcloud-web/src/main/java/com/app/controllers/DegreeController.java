package com.app.controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.webstack.controllers.JKManagedBeanWithOrmSupport;
import com.app.entities.Degree;
@ManagedBean(name = "mbDegree")
@ViewScoped
public class DegreeController extends JKManagedBeanWithOrmSupport<Degree> {
}