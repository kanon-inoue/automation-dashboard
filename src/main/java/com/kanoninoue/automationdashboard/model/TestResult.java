package com.kanoninoue.automationdashboard.model;

public class TestResult {
  private String testName;
  private String status;
  private long executionTime; // showing milliseconds 

  public TestResult(String testName, String status, long execusionTime) {
    this.testName = testName;
    this.status = status;
    this.executionTime = execusionTime;
  }

  public String getTestName() {
    return  testName;
  }

  public String getStatus() {
    return status;
  }

  public long getExecutionTime() {
    return executionTime;
  }  
}
