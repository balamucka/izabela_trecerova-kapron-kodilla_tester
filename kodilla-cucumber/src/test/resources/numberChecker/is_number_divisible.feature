Feature: Is number divisible?
  Scenario Outline: Number is divisible by 3 or 5
    Given There is a <number>
    When Check if number is divisible by 3, 5 or 3 and 5
    Then I should receive <answer>

    Examples:
    |number|  answer   |
    |9     |"Fizz"     |
    |10    |"Buzz"     |
    |15    |"FizzBuzz" |
    |8     |"None"     |