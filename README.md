# CS5800 Quiz 2

## Requirements
- Java 20
- Maven
- JUnit 5

## Folders
- calculator
- dateChecker
built with Test Driven Development (Red -> Green -> Refactor) using JUnit 5.

## Running the tests
- IntelliJ: run `CompleteUnitTest` to run all tests in both packages

## Reflection
While it is a quiz, I learned a lot about TDD and how to use JUnit 5. It also taught me to consider more test cases and edge cases when developing a program. Additionally, I learned that we need to considers the coverage of our tests and how comprehensive they should be. For example, my has31Days consider all 30-day months (April, June, September, and November) are the same as February. While the logic is correct, the implementation was not as efficient as it could be, so I added another switch statement and comments to improve it. I also made some mistakes during the assignment, such as committing the sum stub before its test. However, it was a good learning experience, as we usually write everything in one go and then test it, but TDD is a different approach.

## IDE used: IntelliJ IDEA 2026
