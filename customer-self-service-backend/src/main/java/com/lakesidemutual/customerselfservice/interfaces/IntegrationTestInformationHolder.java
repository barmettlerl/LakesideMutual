package com.lakesidemutual.customerselfservice.interfaces;

import com.lakesidemutual.customerselfservice.infrastructure.InsuranceQuoteRequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/reset")
public class IntegrationTestInformationHolder {
    @Autowired
	private InsuranceQuoteRequestRepository insuranceQuoteRequestRepository;

    @ApiOperation(value = "Reset Database.")
	@GetMapping
	public ResponseEntity<String> getInsuranceQuoteRequests() {
		insuranceQuoteRequestRepository.deleteAll();
		return ResponseEntity.ok().build();
	}
}
