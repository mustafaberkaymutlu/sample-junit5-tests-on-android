# JUnit5 Samples on Android

A repository to demonstrate JUnit5 parameterized tests on Android.

The complementary article is [here](https://medium.com/swlh/how-to-write-junit5-parameterised-tests-on-android-bdf9ec8dc8c4).

Read the JUnit5 documentation [here](https://junit.org/junit5/docs/current/user-guide/).

Check out `mannodermaus`'s [android-junit5](https://github.com/mannodermaus/android-junit5) Gradle plugin.

- Our production code `FactorialCalculator` is [here](/app/src/main/java/net/epictimes/junit5samples/factorialcalculator/FactorialCalculator.kt) 
- Sample parameterised test with CSV sources is [here](/app/src/test/java/net/epictimes/junit5samples/factorialcalculator/FactorialCalculatorCsvSourceTest.kt).
- Sample parameterised test with method sources (with Java 6 compilation target) is [here](/app/src/test/java/net/epictimes/junit5samples/factorialcalculator/FactorialCalculatorMethodSourceTest.kt).
- Sample parameterised test with method sources (with Java 8 compilation target) is [here](/app/src/test/java/net/epictimes/junit5samples/factorialcalculator/FactorialCalculatorMethodSourceWithJava8TargetTest.kt).
- Sample nested test is [here](/app/src/test/java/net/epictimes/junit5samples/factorialcalculator/FactorialCalculatorNestedTest.kt).

## Formatting
[ktlint](https://github.com/pinterest/ktlint) is used to keep the proper formatting. 

Run this to install `ktlint` using brew:
`brew install ktlint`

Then in the Android Studio run the following command: 

`ktlint --apply-to-idea-project --android`