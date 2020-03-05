package com.fastway.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fastway.app.entity.PlanDetails;

public interface PlanDetailsRepo extends JpaRepository<PlanDetails, Long>{

	@Query(value = "select pl.ID, pl.PLAN_LIST_NAME, pl.SERVICE_TYPE, pl.CITY "+
				"from oap.oap_plan_list_t@PRODPINDB pl, oap.OAP_USER_PLAN_LIST_MAP_T@PRODPINDB up "+
				"where pl.ID = up.PLAN_LIST_ID "+
				"and up.USER_ID = ?1",nativeQuery = true)
	List<PlanDetails> getPlansByID(String userId);

}
