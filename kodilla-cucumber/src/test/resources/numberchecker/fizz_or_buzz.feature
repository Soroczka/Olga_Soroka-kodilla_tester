Feature:  Is number divisible or indivisible by three and/or five

  Scenario: Number isn't divisible by three but is divisible by five
    Given Number to check is 5
    When I ask is the number divisible or indivisible by three andor five
    Then It should be "Buzz"

  Scenario Outline: Number is or isn't divisible by three andor five
    Given Number to check is <number>
    When I ask is the number divisible or indivisible by three andor five
    Then It should be <answer>
    Examples:
      | number | answer |
      | 3      | "Fizz" |
      | -9     | "Fizz" |
      | 99     | "Fizz" |
      | 5      | "Buzz"   |
      | -10     | "Buzz"    |
      | 20      | "Buzz"    |
      | 15     | "FizzBuzz" |
      | -300   | "FizzBuzz" |
      | 1      | "Nope"    |
      | 0      | "FizzBuzz"    |
      | -1     | "Nope"    |

