package com.customermanagement.crm.repository;

import com.customermanagement.crm.model.President;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresidentRepository extends JpaRepository<President, Long> {

}