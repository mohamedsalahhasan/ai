# AI Coding Agent Demo

A small Spring Boot repository containing an intentional bug.

## Requirement

`DiscountService.calculateDiscount(price)` should return a 10% discount only when:

    price >= 1000

Otherwise it should return zero.

## Current state

The implementation intentionally violates the requirement, while the unit test exposes the bug.

## Run

    ./mvnw test

or, if Maven is installed:

    mvn test

## Next AI-agent stages

1. Read repository files
2. Ask an LLM to analyze the code and requirement
3. Use tool calling to edit the source
4. Generate/modify JUnit tests
5. Run Maven tests
6. Iterate if tests fail
7. Later: create a Git branch, commit, push, and open a pull request
