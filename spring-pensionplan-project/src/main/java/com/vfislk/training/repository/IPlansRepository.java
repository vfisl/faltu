package com.vfislk.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vfislk.training.exceptions.PlanNotFoundException;
import com.vfislk.training.model.Plans;

@Repository
public interface IPlansRepository extends JpaRepository<Plans, Integer>{


	List<Plans> findByPremium(double premium) throws PlanNotFoundException;
	List<Plans> findByCoverage(String coverage) throws PlanNotFoundException;
	List<Plans> findByAmount(double amount) throws PlanNotFoundException;
	List<Plans> findByterm(String term) throws PlanNotFoundException;
	List<Plans> findByAge(int age) throws PlanNotFoundException;
	List<Plans> checkPremium(int age,double amount) throws PlanNotFoundException;
	List<Plans> checkAmount(int age,double premium) throws PlanNotFoundException;
	List<Plans> checkterm(int age,double amount,double premium) throws PlanNotFoundException;
	
	void updatePlans(double premium,int planId);


	List<Plans> findByAgent(String agentName) throws PlanNotFoundException;
	
	List<Plans> findByCustomer(String firstName, String lastName) throws PlanNotFoundException;
	
	
}
