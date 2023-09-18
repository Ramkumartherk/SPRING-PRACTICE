package com.hcl.cs1.model;

import javax.persistence.Entity; 
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PETS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long petId;
	private String petName;
	private Integer petAge;
	private String petPlace;
	private String status="BUY";
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
}
