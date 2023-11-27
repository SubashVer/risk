package com.example.risk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RiskRepository extends JpaRepository<Risk, Integer> {

}
