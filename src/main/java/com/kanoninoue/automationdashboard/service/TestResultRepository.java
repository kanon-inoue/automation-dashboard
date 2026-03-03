package com.kanoninoue.automationdashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kanoninoue.automationdashboard.model.TestResult;

@Repository
public class TestResultRepository {
  private List<TestResult> results = new ArrayList<>();

  public void save(){
    return;
  }

  // running a test and put the data to history
  public void save(TestResult result) {
    results.add(result);
  }

  public List<TestResult> findAll() {
    return results;
  }
}
