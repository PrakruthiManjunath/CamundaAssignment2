package com.example.camunda.service;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.camunda.bpm.engine.variable.VariableMap;
import org.springframework.stereotype.Service;

@Service
public class CamundaService {
	
public void getCamunda(String activityName) {
		
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
	    ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(activityName);
	    
	    ProcessInstanceWithVariables response = instance.executeWithVariablesInReturn();
	    //VariableMap variables = response.getVariables();
	    //System.out.println(variables);
	    
}

}
