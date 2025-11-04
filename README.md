# 🧩 Maven Multi-Module Project

A simple **Maven multi-module project** that shows how to manage multiple Java modules under one parent project using a single `pom.xml` file.

---

## 📘 Overview

This project demonstrates:
- Managing multiple submodules with a single parent POM  
- Sharing common dependencies and plugins across modules  
- Building and testing all modules together with one command  

---

## 🚀 How to Use

### 1️⃣ Go to the main project folder
```bash
cd maven_parent

### 2️⃣ Build all modules together
   mvn clean install
This will:

Build the parent and all child modules

Run all module tests

Install generated JARs into your local Maven repository
3️⃣ Run a specific module
cd maven_child1
mvn exec:java -Dexec.mainClass="com.parent.child1.MainApp"

⚙️ Parent POM Highlights

The parent POM (pom.xml) manages:

Common dependencies and plugins

Version control for all modules

Centralized configuration

Example:

<modules>
    <module>maven_child1</module>
    <module>maven_child2</module>
</modules>


All child modules automatically inherit these settings using the <parent> tag in their POM files.

💡 Why Use a Multi-Module Project?

Organize large codebases into smaller modules

Reuse code between projects

Manage dependencies efficiently

Build everything with one command

📚 Useful Resources

Maven Official Documentation

Baeldung – Maven Multi-Module Tutorial
