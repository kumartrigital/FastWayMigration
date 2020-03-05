package com.fastway.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlanDetails {

	@Id
	private Long id;
	
	private String planListName;
	
	private String serviceType;
	
	
}
