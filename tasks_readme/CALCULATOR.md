# Claculator

The goal of this task is to implement a simple calculator that will read inputs from standard input will perform a
computation and will print the result to standard output. The calculator will support 4 operations: addition,
subtraction, multiplication and division.

To complete this assignment implement methods in `Calculator` class under `tasks.calculator` package.

The logic of the program should be as follows

1. In the first step the program will output the following prompt to standard output:
    ```
    Enter the operation (allowed operations +,-,*,/):
    ```
2. Then the program will wait for user to enter one of the 4 allowed characters. Calculator should ensure that user
   input corresponds to one of 4 allowed characters. In case user entered something different program will output error
   message to standard error output stream.
3. The program will output the following prompt:
    ```
    Enter left operand:
    ```
4. The program will wait for user to enter a number. Calculator should ensure that the provided input is indeed a
   number. in case user provided not a number the program will output error message to standard error stream.
5. The program will output the following prompt:
    ```
    Enter right operand:
    ```
6. The program will wait for user to enter a number. Calculator should ensure that the provided input is indeed a
   number. In case user provided not a number the program will output error message to standard error stream.
7. The program will ask a user for a number of decimal places with the following prompt:
   ```
   Enter a number of decimal places:
   ```
8. The program will wait for user to enter a number. Calculator should ensure that the provided input is indeed a
   number, and it's an integer. In case user provided not a number the program will output error message to standard
   error stream.
9. The program will compute the result and output it to standard output rounded to the number of decimal places
   provided in step 8 by the user. Example of the output:

   ```
   The result is: leftOperand operation rightOperand = result,
   E.G.
   The result is: 10 * 2 = 20
   ```

## Example of complete run

```
Enter the operation (allowed operations +,-,*,/):
+
Enter left operand:
12.123
Enter right operand:
10
Enter a number of decimal places:
2
The result is: 12.123 + 10 = 22.12
```

## Notes
Program also should not allow users to make invalid operations, e.g. division by zero.