# Lab15 Starter

F.CSM311 Lab 15 - Git Workflow + GitHub Actions CI/CD laboratory project.

## Lab 15 Hiisen Ajliin Tovch Tailan

Ene laboratoriin ajlaar jijig Java Maven project deer Git workflow, pull
request, GitHub Actions CI/CD, matrix build, branch protection, JaCoCo coverage
gate bolon bonus workflow-uudiig heregjuulsen.

### 1. CI Pipeline

`.github/workflows/ci.yml` file uusgej GitHub Actions CI pipeline nemsen. Ene
workflow ni `main` branch ruu push hiih bolon pull request neeh ued ajillana.
CI deer Maven build ajilluulj buh test pass bolj baigaa esehiig shalgana.

### 2. Feature Branch ba Unit Test

`StringUtils.reverse(String)` function nemsen. Uuniig shalgahaar
`StringUtilsTest` class uusgej daraah nuhtsuluudiig test hiisen:

- empty string
- single character
- ASCII text
- Unicode text
- null input

Mun umnuh `isBlank` bolon `capitalize` method-uudad nemelt test bichsen.

### 3. Matrix Build

CI workflow deer Java 17 bolon Java 21 gesen matrix build nemsen. Ingej neg PR
deer hoyor Java version deer zereg test ajillaj, `build-test (17)` bolon
`build-test (21)` checks uusne.

### 4. JaCoCo Coverage Gate

`pom.xml` deer `jacoco-maven-plugin` nemj line coverage minimum 70% baihaar
quality gate tohiruulsan. Coverage 70%-aas baga bol CI fail bolno. Local deer
`mvn -B clean verify` ajilluulahad 13 test pass bolj, coverage 100% garsan.

Coverage report:

```text
target/site/jacoco/index.html
```

### 5. Bonus Tasks

Bonus hesguudiig nemsen:

- Dependabot: Maven bolon GitHub Actions dependency update shalgana
- Commitlint: Pull request commit message Conventional Commits duremtei esehiig shalgana
- Release workflow: `v*.*.*` tag push hiih ued jar build hiigeed GitHub Release uusgene
- Trivy security scan: high/critical vulnerability baigaa esehiig shalgana

## Build and Test

Local deer build/test ajilluulah command:

```bash
mvn -B clean verify
```

Maven PATH deer baihgui bol tur Maven ashiglan:

```powershell
& "$env:TEMP\codex-maven\apache-maven-3.9.9\bin\mvn.cmd" -B clean verify
```

## Project Structure

```text
src/
+-- main/java/lab/
|   +-- Calculator.java
|   +-- StringUtils.java
+-- test/java/lab/
    +-- CalculatorTest.java
    +-- StringUtilsTest.java
```

## GitHub Workflows

- `.github/workflows/ci.yml` - Java 17/21 matrix build, tests, JaCoCo artifact
- `.github/workflows/commitlint.yml` - Conventional Commit check
- `.github/workflows/release.yml` - tag based release jar build
- `.github/workflows/security.yml` - Trivy security scan
- `.github/dependabot.yml` - weekly dependency update check