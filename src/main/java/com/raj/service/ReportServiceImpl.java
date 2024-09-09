package com.raj.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.raj.entity.CitizenPlan;
import com.raj.repo.CitizenPlanRepo;
import com.raj.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private CitizenPlanRepo planrepo;
	
	@Override
	public List<String> getPlanNames() {
		return planrepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return planrepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		CitizenPlan entity = new CitizenPlan();
		
		if(null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}	
		if(null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}	
		if(null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}
		if(null != request.getStartDate() && !"".equals(request.getStartDate())){
			String str = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(str ,formatter);
			entity.setPlanStartDate(date);
		}
		if(null != request.getEndDate() && !"".equals(request.getEndDate())){
			String str = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(str ,formatter);
			entity.setPlanEndDate(date);
		}
		
		return planrepo.findAll(Example.of(entity));
	}
}
