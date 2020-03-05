package com.fastway.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fastway.app.dto.CustomerDto;
import com.fastway.app.entity.PlanDetails;
import com.fastway.app.repo.PlanDetailsRepo;
import com.fastway.app.soap.AddPlanXmlRequest;

@Service
public class PlanDetailsServiceImpl {

	@Autowired
	PlanDetailsRepo planDetailsRepo;
	private AddPlanXmlRequest addPlanXmlRequest;

	public List<PlanDetails> getPlanListResult(String userId) {
		int result = 200;

		List<PlanDetails> plandetails = planDetailsRepo.getPlansByID(userId);

		return plandetails;

	}

	public int addPlanResult(@RequestBody CustomerDto dto) {
		int result = 200;
		String addPlanOpCodeString = "MSO_OP_CUST_ADD_PLAN";
		String addPlanXMlRequest = addPlanXmlRequest.extractAddPlanXMlRequest(dto.getAccountNO());

		int brmResponseResult = addPlanXmlRequest.processBRMRequest(addPlanOpCodeString, addPlanXMlRequest);

		return 0;

	}

}
