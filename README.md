# Maven Multi-Module Project

This repository demonstrates a **Maven multi-module project structure**. It shows how to use a parent POM to manage common build and dependency configurations while organizing code into multiple submodules.

---

## 🛠️ What is a Multi-Module Maven Project?

A multi-module Maven project allows you to:
- Share configuration and dependencies in a central parent POM
- Structure related code across separate modules/subprojects (easy to manage, test, and reuse)
- Build all modules together with a single command

---

## 📂 Project Structure
maven_parent/
├── pom.xml # Parent POM (packaging = pom)
├── maven_child1/
│ ├── pom.xml # First child module
│ └── src/
├── maven_child2/
│ ├── pom.xml # Second child module
│ └── src/
└── .gitignore


---

## 🚀 How to Build All Modules

Make sure you are in the root (`maven_parent`) folder, then run:
mvn clean install


This will:
- Build the parent and all child modules
- Install output JARs into your local Maven repository
- Run unit tests for all modules

---

## 📝 Parent POM Key Elements

- `<modules>` lists all child modules (folders)
- `<dependencyManagement>` section: centralizes versions for dependencies used in children
- Child modules inherit configuration by having `<parent>` in their POM

---

## 🗂️ Example: Adding a Child Module Dependency

If `maven_child2` needs to use code from `maven_child1`, add this to `maven_child2/pom.xml`:

<dependency> <groupId>com.parent</groupId> <artifactId>maven_child1</artifactId> <version>1.0-SNAPSHOT</version> </dependency> ```

📚 Resources
Baeldung - Maven Multi-Module Project

Maven Official Docs
✍️ Credits
Created by manishpxl for learning and demonstration purposes.

Feel free to fork or use as a template for your own Java multi-module builds!
