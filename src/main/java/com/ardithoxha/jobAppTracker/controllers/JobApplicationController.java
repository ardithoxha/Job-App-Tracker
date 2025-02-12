package com.ardithoxha.jobAppTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ardithoxha.jobAppTracker.models.JobApplication;
import com.ardithoxha.jobAppTracker.services.JobApplicationService;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {
	@Autowired
	private JobApplicationService jobService;

	@PostMapping("/add")
	public ResponseEntity<Boolean> addJob(@RequestBody JobApplication job) {
		return ResponseEntity.ok(jobService.addJob(job));
	}

	@GetMapping
	public List<JobApplication> getAllJobs() {
		return jobService.getAllJobs();
	}
}
