
package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee_")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="second_name")
	private String secondName;
	@Column(name="third_name")
	private String thirdName;
	@Column(name="last_name_")
	private String lastName;
	@Column(name="salary")
	private Double salary;
	@Column(name="email")
	private String email;
	@OneToOne
	@JoinColumn(name="department")
	private Department department;
	@Column(name="degree")
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