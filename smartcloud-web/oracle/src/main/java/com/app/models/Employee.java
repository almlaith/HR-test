package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="EMPLOYEE_")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment") 
	@Column(name="ID")
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="SECOND_NAME")
	private String secondName;
	
	@Column(name="THIRD_NAME")
	private String thirdName;
	
	@Column(name="LAST_NAME_")
	private String lastName;
	
	@Column(name="SALARY")
	private Double salary;
	
	@Column(name="EMAIL")
	private String email;
	
	@OneToOne
	@JoinColumn(name="DEPARTMENT")
	private Department department;
	
	@Column(name="DEGREE")
	private String degree;
	
    public Employee withId(Integer id){
	  this.id=id;
	  return this;
	}

    public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

    public Employee withFirstName(String firstName){
	  this.firstName=firstName;
	  return this;
	}

    public void setFirstName(String firstName){
	  this.firstName=firstName;
	}
	
	public String getFirstName(){
	 return this.firstName;
	}

    public Employee withSecondName(String secondName){
	  this.secondName=secondName;
	  return this;
	}

    public void setSecondName(String secondName){
	  this.secondName=secondName;
	}
	
	public String getSecondName(){
	 return this.secondName;
	}

    public Employee withThirdName(String thirdName){
	  this.thirdName=thirdName;
	  return this;
	}

    public void setThirdName(String thirdName){
	  this.thirdName=thirdName;
	}
	
	public String getThirdName(){
	 return this.thirdName;
	}

    public Employee withLastName(String lastName){
	  this.lastName=lastName;
	  return this;
	}

    public void setLastName(String lastName){
	  this.lastName=lastName;
	}
	
	public String getLastName(){
	 return this.lastName;
	}

    public Employee withSalary(Double salary){
	  this.salary=salary;
	  return this;
	}

    public void setSalary(Double salary){
	  this.salary=salary;
	}
	
	public Double getSalary(){
	 return this.salary;
	}

    public Employee withEmail(String email){
	  this.email=email;
	  return this;
	}

    public void setEmail(String email){
	  this.email=email;
	}
	
	public String getEmail(){
	 return this.email;
	}

    public Employee withDepartment(Department department){
	  this.department=department;
	  return this;
	}

    public void setDepartment(Department department){
	  this.department=department;
	}
	
	public Department getDepartment(){
	 return this.department;
	}

    public Employee withDegree(String degree){
	  this.degree=degree;
	  return this;
	}

    public void setDegree(String degree){
	  this.degree=degree;
	}
	
	public String getDegree(){
	 return this.degree;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	 Employee that = (Employee) obj;
	 if (this.getId() == null) {
	   return this.toString().equals(that.toString());
	  }
	  return this.getId().equals(that.getId());	  
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.firstName).append(",");
	  buf.append(this.secondName).append(",");
	  buf.append(this.thirdName).append(",");
	  buf.append(this.lastName).append(",");
	  buf.append(this.salary).append(",");
	  buf.append(this.email).append(",");
	  buf.append(this.department).append(",");
	  buf.append(this.degree).append(",");
	  return buf.toString();
	}
}