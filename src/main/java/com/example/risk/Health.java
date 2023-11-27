package com.example.risk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Health {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String patientName;
    private int bloodPressure;
    // Add other health-related fields as needed
    // For example:
    // private int heartRate;
    // private double temperature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    // Add getters and setters for other health-related fields
    // For example:
    // public int getHeartRate() {
    //     return heartRate;
    // }
    //
    // public void setHeartRate(int heartRate) {
    //     this.heartRate = heartRate;
    // }
    //
    // public double getTemperature() {
    //     return temperature;
    // }
    //
    // public void setTemperature(double temperature) {
    //     this.temperature = temperature;
    // }
}
