package com.kanoninoue.automationdashboard.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kanoninoue.automationdashboard.model.TestResult;
import com.kanoninoue.automationdashboard.service.TestResultRepository;

@RestController
@RequestMapping("/api/tests")
public class TestController {
  private final TestResultRepository repository;

  public TestController(TestResultRepository repository) {
    this.repository = repository;
  };

  // to prevent error 405 -> use get
  // GET → retrieve data
  // POST → create data (like running a test)
  // POST = simulate running a test (/api/tests/run)
  @GetMapping("/run")
    public TestResult runTest(@RequestParam(defaultValue = "Sample Test") String name) {
        TestResult result = new TestResult(name, "PASSED", LocalDateTime.now());
        repository.save(result);
        return result;
    }
    // GET = view all previous test runs (/api/tests/history)
    @GetMapping("/history")
    public List<TestResult> getHistory() {
        return repository.findAll();
    }
  }
