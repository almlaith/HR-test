
package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="department")
public class Department implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="decs")
	private String decs;

    public Department withId(Integer id){
	  this.id=id;
	  return this;
	}

    public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

    public Department withName(String name){
	  this.name=name;
	  return this;
	}

    public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}

    public Department withDecs(String decs){
	  this.decs=decs;
	  return this;
	}

    public void setDecs(String decs){
	  this.decs=decs;
	}
	
	public String getDecs(){
	 return this.decs;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	 Department that = (Department) obj;
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
	  buf.append(this.name).append(",");
	  buf.append(this.decs).append(",");
	  return buf.toString();
	}
}