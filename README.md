# 🧩 Maven Multi-Module Project

A simple **Maven multi-module Java project** that demonstrates how to manage multiple modules under a single parent using a shared `pom.xml`. 🚀  

This setup helps organize large applications into smaller, manageable parts — each module can be built, tested, and maintained independently while sharing configurations and dependencies.

---

## 📘 Overview

This project demonstrates how to:
- Manage multiple **child modules** with a single **parent POM**
- Share common dependencies and plugins across modules
- Build and test all modules together with **one command**
- Maintain modular and scalable Java project structures

---

## 🚀 How to Use

### 1️⃣ Navigate to the main (parent) project
```bash
cd maven_parent
2️⃣ Build all modules together
mvn clean install
This command will:

Build the parent and all child modules

Run unit tests for every module

Install generated JARs into your local Maven repository
3️⃣ Run a specific module
cd maven_child1
mvn exec:java -Dexec.mainClass="com.parent.child1.MainApp"

⚙️ Parent POM Highlights

The parent POM (pom.xml) defines:

Common dependencies and plugin versions

Centralized build configuration

List of modules to be included in the build
📚 Useful Resources

Maven Official Documentation

Baeldung – Maven Multi-Module Tutorial
⭐ Feedback

If you find this project helpful, please give it a ⭐️ and share your feedback!
Made with ❤️ by manishpxl
