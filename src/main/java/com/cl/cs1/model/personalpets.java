package com.cl.cs1.model;

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
@Table(name="PERSONAL_PETS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class personalpets {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long petId;
	private String petName;
	private Integer petAge;
	private String petPlace;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
}
