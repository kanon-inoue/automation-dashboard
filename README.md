# Automation Dashboard

A **backend automation test dashboard** built with **Java Spring Boot**, designed to execute and track automated Selenium tests. Prepared for **AWS deployment** and clean layered architecture.

## Table of Contents

- [Project Overview](#project-overview)
- [Tech Stack](#tech-stack)
- [Features](#features)
- [Getting Started](#getting-started)
- [Future Improvements](#future-improvements)
- [License](#license)

---

## Project Overview

This project provides a RESTful API to:

- Execute automated tests (currently dummy data)
- Track test execution history
- Follow **Controller → Service → Repository** architecture
- Designed to integrate **Selenium for real browser testing** and store results in a database

---

## Tech Stack

- **Backend:** Java, Spring Boot
- **Build Tool:** Maven
- **Version Control:** Git, GitHub
- **Deployment Ready:** AWS (EC2, DynamoDB or RDS)
- **Future Testing:** Selenium (JUnit / TestNG)

---

## Features

- Run a test via POST `/api/tests/run`
- View all previous test results via GET `/api/tests/history`
- Layered architecture for easy maintainability
- In-memory repository for quick development

---

## Getting Started

### Prerequisites

- Java 17+
- Maven
- Git
- IDE: VS Code, IntelliJ, or Eclipse

### Clone the Repository

```bash
git clone git@github.com:kanon-inoue/automation-dashboard.git
cd automation-dashboard
```
