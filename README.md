# Lucky Number Calculator

## Getting Started

Welcome to the Lucky Number Calculator project! This program calculates a person's lucky number based on their date of birth. The lucky number is derived by summing the digits of the day, month, and year of the date of birth.

## Folder Structure

The workspace contains the following folders:

- `src`: Contains the Java source code files.
- `lib`: Used to maintain dependencies (currently not used in this project).

The compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Script Explanation

The main script, `LuckyNumberCalculator.java`, prompts the user to enter their date of birth (day, month, and year). It then calculates the sum of these values and further sums the digits of this sum to determine the lucky number. The result is displayed to the user.

### Example

If the date of birth is 12/07/1980:
1. Sum the day, month, and year: `12 + 7 + 1980 = 1999`
2. Sum the digits of the result: `1 + 9 + 9 + 9 = 28`
3. The lucky number is: `28`

### Code

```java
import java.util.*;

public class LuckyNumberCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize scanner for user input
        int day, month, year, luckyNumber, sum, digit1, digit2, digit3, digit4;

        System.out.println("Enter date of birth");

        System.out.print("day: "); // Prompt user to enter day of birth
        day = sc.nextInt(); // Read day of birth

        System.out.print("month: "); // Prompt user to enter month of birth
        month = sc.nextInt(); // Read month of birth

        System.out.print("year: "); // Prompt user to enter year of birth
        year = sc.nextInt(); // Read year of birth

        sum = day + month + year; // Sum day, month, and year

        digit1 = sum / 1000; // Get the first digit of the sum
        digit2 = sum / 100 % 10; // Get the second digit of the sum
        digit3 = sum / 10 % 10; // Get the third digit of the sum
        digit4 = sum % 10; // Get the last digit of the sum

        luckyNumber = digit1 + digit2 + digit3 + digit4; // Calculate the lucky number by summing all digits

        System.out.println("Your lucky number is: " + luckyNumber); // Output the lucky number
    }
}
````

## How to Run

- Open the project in Visual Studio Code.
- Ensure you have Java installed on your system.
- Compile the Java file

````
javac src/LuckyNumberCalculator.java -d bin
````
## Run the compiled program:

````
java -cp bin LuckyNumberCalculator
````

##Acknowledgements

- Thanks to the Visual Studio Code team for providing a powerful and flexible IDE.
- Thanks to the Java community for the extensive resources and support available.
- Special thanks to the OpenAI team for their assistance in improving code quality and documentation.

Feel free to reach out if you have any questions or suggestions!

Happy Coding!

````
This README.md is structured to provide a clear and professional overview of your project, making it easy for others to understand and use your code.
````
