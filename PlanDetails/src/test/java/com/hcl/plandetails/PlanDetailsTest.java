package com.hcl.plandetails;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.plandetails.DAO.PlanDAOImpl;
import com.hcl.plandetails.model.Plan;
import com.hcl.plandetails.service.PlanServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PlanDetailsTest {

	@InjectMocks
	PlanServiceImpl planserviceImpleMock;

	@Mock
	PlanDAOImpl planDAOImpl;

	@Test
	public void tesGetPlanSuccess() throws Exception {

		List<Plan> mockProduct = new ArrayList<Plan>();

		Plan planONE = new Plan();
		planONE.setAmount("20");
		planONE.setPlanDescription("limited plan");
		planONE.setPlanID("1");

		planONE.setPlanName("LimitedPlan");

		mockProduct.add(planONE);

		Mockito.when(planDAOImpl.fetchPlanDetails()).thenReturn(mockProduct);

		List<Plan> response = planserviceImpleMock.getAllPlanDetails();

		Assert.assertNotNull(response.size());

	}

	@Test
	public void tesGetPlanFailure() throws Exception {

		Mockito.when(planDAOImpl.fetchPlanDetails()).thenReturn(null);

		List<Plan> response = planserviceImpleMock.getAllPlanDetails();

		Assert.assertNull(response);

	}

}
