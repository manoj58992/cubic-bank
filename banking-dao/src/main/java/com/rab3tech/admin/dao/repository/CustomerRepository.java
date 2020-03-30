package com.rab3tech.admin.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rab3tech.dao.entity.Customer;

/**
 * 
 * @author nagendra
 * 
 * Spring Data JPA repository
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
