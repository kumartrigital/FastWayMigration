package com.fastway.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fastway.app.dto.CustomerDto;
import com.fastway.app.entity.PlanDetails;
import com.fastway.app.service.PlanDetailsServiceImpl;
import com.fastway.app.soap.model.planSoapModel;

@RestController
@RequestMapping(value = "/api/v1/fastway", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PlansController {

	@Autowired
	PlanDetailsServiceImpl planDetailsServiceImpl;

	@GetMapping(value = "/getplanlist")
	public List<PlanDetails> getPlanList(@RequestParam String userId) {

		return planDetailsServiceImpl.getPlanListResult(userId);

	}

	// working

	@PostMapping(value = "/addPlan")
	public ResponseEntity<String> addPlan(@RequestBody CustomerDto planDto) {

		int addPlanResult = planDetailsServiceImpl.addPlanResult(planDto);

		planSoapModel planSoapModel = null;
		String addPlanResponseJson = planSoapModel.getAddPlanResponse();

		if (addPlanResult == 200)
			return new ResponseEntity<String>(addPlanResponseJson, HttpStatus.OK);
		else if (addPlanResult == 403)
			return new ResponseEntity<String>(addPlanResponseJson, HttpStatus.FORBIDDEN);
		else if (addPlanResult == 404)
			return new ResponseEntity<String>("BAD REQUEST", HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<String>(addPlanResponseJson, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
