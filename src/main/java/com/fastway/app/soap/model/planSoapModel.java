package com.fastway.app.soap.model;

public class planSoapModel {

	private String addPlanResponse;
	
	private String retryAddPlanResponse;

	private String planChangeResponse;
	
	private String retryPlanChangeResponse;

	private String cancelPlanResponse;
	
	private String retryCancelPlanResponse;

	private String planInfo;
	
	private String planList;
	
	private String obrmResponseString;

	public String getCancelPlanResponse() {
		return cancelPlanResponse;
	}

	public void setCancelPlanResponse(String cancelPlanResponse) {
		this.cancelPlanResponse = cancelPlanResponse;
	}

	public String getRetryCancelPlanResponse() {
		return retryCancelPlanResponse;
	}

	public void setRetryCancelPlanResponse(String retryCancelPlanResponse) {
		this.retryCancelPlanResponse = retryCancelPlanResponse;
	}

	public String getPlanChangeResponse() {
		return planChangeResponse;
	}

	public void setPlanChangeResponse(String planChangeResponse) {
		this.planChangeResponse = planChangeResponse;
	}

	public String getRetryPlanChangeResponse() {
		return retryPlanChangeResponse;
	}

	public void setRetryPlanChangeResponse(String retryPlanChangeResponse) {
		this.retryPlanChangeResponse = retryPlanChangeResponse;
	}

	public String getPlanList() {
		return planList;
	}

	public void setPlanList(String planList) {
		this.planList = planList;
	}

	public String getPlanInfo() {
		return planInfo;
	}

	public void setPlanInfo(String planInfo) {
		this.planInfo = planInfo;
	}

	public String getAddPlanResponse() {
		return addPlanResponse;
	}

	public void setAddPlanResponse(String addPlanResponse) {
		this.addPlanResponse = addPlanResponse;
	}

	public String getRetryAddPlanResponse() {
		return retryAddPlanResponse;
	}

	public void setRetryAddPlanResponse(String retryAddPlanResponse) {
		this.retryAddPlanResponse = retryAddPlanResponse;
	}

	public String getObrmResponseString() {
		return obrmResponseString;
	}

	public void setObrmResponseString(String obrmResponseString) {
		this.obrmResponseString = obrmResponseString;
	}

}
