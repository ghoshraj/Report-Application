package com.raj.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.raj.entity.CitizenPlan;
import com.raj.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		repo.deleteAll();
		
		// cash plan data

		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Rajesh");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Denied");
		c1.setDenialReason("Buisness Income");

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Subhasis");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Approved");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenefitAmount(5000.00);

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Ankita");
		c3.setGender("FeMale");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Approved");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(5000.00);

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Riya");
		c4.setGender("FeMale");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Terminated");
		c4.setPlanStartDate(LocalDate.now().minusMonths(3));
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(4000.00);
		c4.setTerminatedDate(LocalDate.now());
		c4.setTerminationReason("Employed");

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Piysh");
		c5.setGender("Male");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Rental Income");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Animesh");
		c6.setGender("Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmount(7000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("Employed");

		// food plan data

		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Debasis");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Denied");
		c7.setDenialReason("Buisness Income");

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Subhasis");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Approved");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmount(3000.00);

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Sandhita");
		c9.setGender("FeMale");
		c9.setPlanName("Food");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmount(7000.00);

		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Suroj");
		c10.setGender("Male");
		c10.setPlanName("Food");
		c10.setPlanStatus("Terminated");
		c10.setPlanStartDate(LocalDate.now().minusMonths(5));
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmount(8000.00);
		c10.setTerminatedDate(LocalDate.now());
		c10.setTerminationReason("Employed");

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Nabanita");
		c11.setGender("FeMale");
		c11.setPlanName("Food");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Rental Income");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Surojit");
		c12.setGender("Male");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(3));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(3500.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("Employed");

		// Medical plan

		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Swapan");
		c13.setGender("Male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Denied");
		c13.setDenialReason("Buisness Income");

		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Subha");
		c14.setGender("Male");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Approved");
		c14.setPlanStartDate(LocalDate.now());
		c14.setPlanEndDate(LocalDate.now().plusMonths(6));
		c14.setBenefitAmount(9000.00);

		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Nandita");
		c15.setGender("FeMale");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Approved");
		c15.setPlanStartDate(LocalDate.now());
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmount(8000.00);

		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Rohit");
		c16.setGender("Male");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Terminated");
		c16.setPlanStartDate(LocalDate.now().minusMonths(2));
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenefitAmount(10000.00);
		c16.setTerminatedDate(LocalDate.now());
		c16.setTerminationReason("Employed");

		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Nabanita");
		c17.setGender("FeMale");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Denied");
		c17.setDenialReason("Rental Income");

		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Bibek");
		c18.setGender("Male");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated");
		c18.setPlanStartDate(LocalDate.now().minusMonths(5));
		c18.setPlanEndDate(LocalDate.now().plusMonths(6));
		c18.setBenefitAmount(5500.00);
		c18.setTerminatedDate(LocalDate.now());
		c18.setTerminationReason("Employed");

		// Employment plan

		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Rahul");
		c19.setGender("Male");
		c19.setPlanName("Employment");
		c19.setPlanStatus("Denied");
		c19.setDenialReason("Buisness Income");

		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Ram");
		c20.setGender("Male");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Approved");
		c20.setPlanStartDate(LocalDate.now());
		c20.setPlanEndDate(LocalDate.now().plusMonths(6));
		c20.setBenefitAmount(3000.00);

		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Nandita");
		c21.setGender("FeMale");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Approved");
		c21.setPlanStartDate(LocalDate.now());
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmount(7000.00);

		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Ram");
		c22.setGender("Male");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Terminated");
		c22.setPlanStartDate(LocalDate.now().minusMonths(5));
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenefitAmount(8000.00);
		c22.setTerminatedDate(LocalDate.now());
		c22.setTerminationReason("Employed");

		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Binita");
		c23.setGender("FeMale");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Denied");
		c23.setDenialReason("Rental Income");

		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Abhi");
		c24.setGender("Male");
		c24.setPlanName("Employment");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(3));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenefitAmount(3500.00);
		c24.setTerminatedDate(LocalDate.now());
		c24.setTerminationReason("Employed");

		// Save the data

		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
				c17, c18, c19, c20, c21, c22, c23, c24);
		
		repo.saveAll(list);
		
	}
}
