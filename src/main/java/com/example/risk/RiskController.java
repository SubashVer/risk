package com.example.risk;

import com.example.risk.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk")
public class RiskController {

    private final RiskService riskService;

    @Autowired
    public RiskController(RiskService riskService) {
        this.riskService = riskService;
    }

    @GetMapping(value = "")
    public String getRisk() {
        return "No risk";
    }

    @PostMapping(value = "/calculate", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Risk calculateRisk(@RequestBody Health health) {
        return riskService.calculateRisk(health);
    }

    // Add error handling if needed
}
