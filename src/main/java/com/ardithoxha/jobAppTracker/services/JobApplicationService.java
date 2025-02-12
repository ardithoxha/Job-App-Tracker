package com.ardithoxha.jobAppTracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ardithoxha.jobAppTracker.models.JobApplication;

@Service
public class JobApplicationService {
	
	private List<JobApplication> jobs = new ArrayList<JobApplication>();

	public List<JobApplication> getAllJobs() {
		return jobs;
	}

	public boolean addJob(JobApplication job) {
		return jobs.add(job);
	}
}
