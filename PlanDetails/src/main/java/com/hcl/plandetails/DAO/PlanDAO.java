package com.hcl.plandetails.DAO;

import java.util.List;

import com.hcl.plandetails.model.Plan;

public interface PlanDAO {

	public List<Plan> fetchPlanDetails();

}
