package com.kanoninoue.automationdashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kanoninoue.automationdashboard.model.TestResult;

@Service
public class TestExecutionService {
  private final List<TestResult> testHistory = new ArrayList<>();

  // running a test and put the data to history
  public TestResult runTest() {
    TestResult result = new TestResult("GoogleTest", "PASS", 1200);
    testHistory.add(result);
    return result;
  }

  public List<TestResult> getHistory() {
    return testHistory;
  }
}
