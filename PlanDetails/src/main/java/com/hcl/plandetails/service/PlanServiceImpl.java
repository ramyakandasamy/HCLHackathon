package com.hcl.plandetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.plandetails.DAO.PlanDAOImpl;
import com.hcl.plandetails.model.Plan;

@Service("planservice")
public class PlanServiceImpl implements PlanService {

	@Autowired
	PlanDAOImpl planDAOImpl;

	public List<Plan> getAllPlanDetails() {

		return planDAOImpl.fetchPlanDetails();
	}

}
