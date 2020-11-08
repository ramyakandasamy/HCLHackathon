package com.hcl.plandetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.plandetails.model.Plan;
import com.hcl.plandetails.service.PlanService;

@RestController
public class PlanController {

	@Autowired
	PlanService planservice;

	@GetMapping("/getPlanDetails")

	public List<Plan> getPlan() throws Exception {

		return planservice.getAllPlanDetails();
	}

}
