package com.fastway.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlanDetailsDto {

	private String planId;
	private String planType;
	private String planSubType;
	private String code;
	private String description;
	private String poId;
	private String serviceType;
	private String paymentType;
	private String planCategory;
	private String deviceType;

}
