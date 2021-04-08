package com.meracart.commonobjects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@Entity
@Table(name="users")
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
	private String userName;
    private String firstName;
	private String lastName;
	private String gender;
	private String email;	
	
}
