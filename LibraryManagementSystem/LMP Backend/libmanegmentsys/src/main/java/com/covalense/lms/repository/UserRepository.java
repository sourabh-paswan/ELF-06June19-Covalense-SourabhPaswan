package com.covalense.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.lms.dto.UsersBean;

public interface UserRepository extends CrudRepository<UsersBean, Integer> {

}
