package com.kanoninoue.automationdashboard.model;

import java.time.LocalDateTime;

public class TestResult {
  private String testName;
  private String status;
  private LocalDateTime runTime; // showing milliseconds 

  public TestResult() {}

  public TestResult(String testName, String status, LocalDateTime runTime) {
    this.testName = testName;
    this.status = status;
    this.runTime = runTime;
  }

  public String getTestName() {
    return  testName;
  }
  public void setTestName() {
    this.testName = testName;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus() {
    this.status = status;
  }

  public LocalDateTime getRunTime() {
    return runTime;
  }
  public void setRunTime() {
    this.runTime = runTime;
  }
}
