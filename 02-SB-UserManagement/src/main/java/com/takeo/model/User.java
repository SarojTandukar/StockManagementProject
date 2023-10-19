package com.takeo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
   @Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String gender;
	
	
	private String[] courses;
	private String cityFrom;
	private String cityTo;
	
}
