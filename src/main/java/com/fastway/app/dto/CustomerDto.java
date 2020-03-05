package com.fastway.app.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private String accountNO;

	private String accountPoid;

	private String serviceObj;

	private List<PlanDetailsDto> planList;

	
}
