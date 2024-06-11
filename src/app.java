// 

/*
 * Program that asks for a person's date of birth (day, month, year) via keyboard input and calculates their lucky number.

The lucky number is calculated by adding the day, month, and year of the date of birth, and then adding the digits obtained in the sum.

For example:
If the date of birth is 12/07/1980
We calculate the lucky number as follows: 12+7+1980 = 1999 1+9+9+9 = 28
Lucky number: 28
 */

 import java.util.*;

 public class app {
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
 
