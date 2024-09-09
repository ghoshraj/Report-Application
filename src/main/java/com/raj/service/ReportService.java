package com.raj.service;

import java.util.List;

import com.raj.entity.CitizenPlan;
import com.raj.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();

	public List<String> getPlanStatus();

	public List<CitizenPlan> search(SearchRequest request);

}
