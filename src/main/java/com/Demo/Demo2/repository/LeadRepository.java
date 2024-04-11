package com.Demo.Demo2.repository;

import com.Demo.Demo2.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {
}
