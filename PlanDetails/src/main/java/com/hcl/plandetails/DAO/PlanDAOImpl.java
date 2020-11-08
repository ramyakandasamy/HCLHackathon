package com.hcl.plandetails.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hcl.plandetails.model.Plan;

@Component
public class PlanDAOImpl implements PlanDAO {

	public List<Plan> fetchPlanDetails() {

		List<Plan> planList = new ArrayList<Plan>();

		Plan planONE = new Plan();
		planONE.setAmount("20");
		planONE.setPlanDescription("limited plan");
		planONE.setPlanID("1");

		planONE.setPlanName("LimitedPlan");

		Plan planTWO = new Plan();
		planTWO.setAmount("50");
		planTWO.setPlanDescription("unlimited plan");
		planTWO.setPlanID("2");

		planTWO.setPlanName("unLimitedPlan");

		planList.add(planONE);
		planList.add(planTWO);

		return planList;
	}

}
