package com.cl.cs1.model;

import javax.persistence.*; 

import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
  
   
    
    @Column(name="role_id")
    private Long id;
    private String name;
   // private Set<User> users;

    @Id
    @Column(name="role_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
