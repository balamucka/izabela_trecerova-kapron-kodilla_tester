Feature: FizzBuzz game

Scenario Outline: Number is divisible by 3 or 5 or both or none
    Given the number is <number>
    When calculator check if the number is divisible by 3 or 5 or both or none
    Then I should be told <answer>
    Examples:
    |number| answer    |
    |9     |"Fizz"     |
    |10    |"Buzz"     |
    |15    |"FizzBuzz" |
    |8     |"None"     |
