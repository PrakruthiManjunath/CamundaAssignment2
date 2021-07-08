package com.example.camunda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.service.CamundaService;

@RestController
@RequestMapping("/api")
public class CamundaController {
	
	@Autowired
	CamundaService camundaService;
	
	@GetMapping("/process/{activityName}")
	public void getByName(@PathVariable String activityName)
	{
		camundaService.getCamunda(activityName);
	}

}
