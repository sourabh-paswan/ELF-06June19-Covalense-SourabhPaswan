package com.covalense.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {

	@Query("select e from EmployeeOtherInfoBean e where e.infoBean=:id")
	public EmployeeOtherInfoBean findByEmpId(@Param("id") EmployeeInfoBean id);
	
	
	@Query("select e from EmployeeOtherInfoBean e where e.infoBean=:id")
	public EmployeeOtherInfoBean updateEmp(@Param("id") EmployeeInfoBean id);

}
