package com.kanoninoue.automationdashboard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kanoninoue.automationdashboard.model.TestResult;
import com.kanoninoue.automationdashboard.service.TestExecutionService;


@RestController
@RequestMapping("/api/tests")
public class TestController {
  private final TestExecutionService testService;

  public TestController(TestExecutionService testService) {
    this.testService = testService;
  };

  // to prevent error 405
  @GetMapping("/run")
  public TestResult runTestGet() {
      return testService.runTest();
  }

  // POST = simulate running a test (/api/tests/run)
  @PostMapping("/run")
  public TestResult runResult() {
      return testService.runTest();
  }

  // GET = view all previous test runs (/api/tests/history)
  @GetMapping("/history")
  public List<TestResult> getHistory() {
      return testService.getHistory();
  }
}
