package com.example.risk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

    private final RiskRepository riskRepository;

    @Autowired
    public RiskService(RiskRepository riskRepository) {
        this.riskRepository = riskRepository;
    }

    public Risk calculateRisk(Health health) {
        // Implement logic to calculate risk based on health data
        // For simplicity, let's assume a basic logic for illustration
        String riskLevel = (health.getBloodPressure() > 120) ? "High" : "Low";

        // Create a new Risk entity and save it
        Risk risk = new Risk();
        risk.setRiskLevel(riskLevel);
        return riskRepository.save(risk);
    }
}
