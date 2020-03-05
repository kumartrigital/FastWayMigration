package com.fastway.app.soap;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import _36._0._21._172.infranetwebsvc.services.brmbaseservices.InfranetWebServiceServiceStub;
import _36._0._21._172.infranetwebsvc.services.brmbaseservices.InfranetWebServiceServiceStub.Opcode;
import _36._0._21._172.infranetwebsvc.services.brmbaseservices.InfranetWebServiceServiceStub.OpcodeResponse;

public class AddPlanXmlRequest {

	public String extractAddPlanXMlRequest(String userID) {

		if (plan_list != null) {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			stringBuffer.append("<MSO_OP_CUST_ADD_PLAN_inputFlist>");
			stringBuffer.append("<POID>" + ACCOUNT_POID + "</POID>");
			stringBuffer.append("<SERVICE_OBJ>" + SERVICE_OBJ + "</SERVICE_OBJ>");
			for (int i = 0; i < plan_list.length; i++) {
				PLANElement[] plans = plan_list[i].getPlans();
				for (int j = 0; j < plans.length; j++) {
					stringBuffer.append("<PLAN_LISTS elem=\'" + j + "\'>");
					stringBuffer.append("<PLAN_OBJ>" + plans[j].getPoid() + "</PLAN_OBJ>");
					stringBuffer.append("</PLAN_LISTS>");
				}
			}
			// stringBuffer.append("<PROGRAM_NAME>FWFOS|"+validator.getUserID()+"_"+validator.getDeviceIMEI()+"</PROGRAM_NAME>");
			stringBuffer.append("<PROGRAM_NAME>FWFOS|" + validator.getUserID() + "</PROGRAM_NAME>");
			stringBuffer.append("<DESCR>Others</DESCR>");
			// stringBuffer.append("<USERID>0.0.0.1 /account 115000 0</USERID>");
			stringBuffer.append("<USERID>" + userID + "</USERID>");
			stringBuffer.append("</MSO_OP_CUST_ADD_PLAN_inputFlist>");
			String addPlanXML = stringBuffer.toString();
			System.out.println("Add Plan XML: \n");
			System.out.println(addPlanXML);
			return addPlanXML;
		} else
			return null;
	}

	public int processBRMRequest(String opCodeString, String xmlRequest) {
		int result = 200;
		String jsonString = null;
		try {
			InfranetWebServiceServiceStub stub = new InfranetWebServiceServiceStub();
			Opcode opcode = new Opcode();
			opcode.setOpcode(opCodeString);
			opcode.setInputXML(xmlRequest);
			opcode.setM_SchemaFile("?");
			OpcodeResponse opcodeResponse = stub.opcode(opcode);
			String responseString = opcodeResponse.getOpcodeReturn();

			// logger.info(responseString);
			int INDENT_FACTOR = 4;
			JSONObject xmlJSONObj = XML.toJSONObject(responseString);
			jsonString = xmlJSONObj.toString(INDENT_FACTOR);
			jsonString = jsonString
					.replaceAll("\"xmlns:brm\": \"http://xmlns.oracle.com/BRM/schemas/BusinessOpcodes\",", "");
			jsonString = jsonString.replaceAll("\n", "").replace("\r", "");
			jsonString = jsonString.replaceAll("brm:", "");
			// logger.info(jsonString);

		} catch (JSONException | IOException e) {
			// TODO Auto-generated catch block
			jsonString = e.getMessage();
			result = -100;
		}
		//setObrmResponseString(jsonString);
		return result;
	}

}
