package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi savu vārdu: ");

        // String name = scanner.nextLine();

        // System.out.println("Ieavadi savu uzvārdu: ");
        // String lastname = scanner.nextLine();

        // System.out.println("Ievadi savu grupu: ");
        // String group = scanner.nextLine();

        // System.out.println("Students: " + name + " " + lastname + ", Grupa: " + group);


        // Mēs saņēmam ievadi kā String vērtību
        // String input = scanner.nextLine();

        // Veidojām int datu tipa mainīgo, un konvertējam input uz int
        // int inputAsInt = Integer.valueOf(input);

        // System.out.println(inputAsInt * 10);

        
        // Izveidot programmu, kura prasa ievadīt divus ciparus,
        // Uz izvadē mmēs gribam rezdēt to ciparu reizinājumu

        // Scanner scanner = new Scanner(System.in);

        // int skaitlis1 = Integer.valueOf(scanner.nextLine());
        // int skaitlis2 = Integer.valueOf(scanner.nextLine());

        // System.out.println(skaitlis1 * skaitlis2);


        // Scanner scanner = new Scanner(System.in);

        // int cipars1 = Integer.valueOf(scanner.nextLine());
        // int cipars2 = Integer.valueOf(scanner.nextLine());
        // int cipars3 = Integer.valueOf(scanner.nextLine());

        // System.out.println(cipars1 + cipars2 + cipars3);
        // System.out.println(cipars1 * cipars2 * cipars3);
        // System.out.println((cipars1 + cipars2 + cipars3) / 3.0);


        // Scanner scanner = new Scanner(System.in);

        // int x = 10;

        // x += 10;
        
        // // Tas ir pieskaitīt x vieninieku
        // x = x + 1;
        // x++;
        // System.out.println(x);


        // int length = 42;
        // System.out.println("Length " + length);

        // Scanner scanner = new Scanner(System.in);

        // int sum = 3;
        // int digitCount = 2;

        // double result1 = (double) sum / digitCount;
        // System.out.println(result1); // prints 1.5

        // double result2 = sum / (double) digitCount;
        // System.out.println(result2); // prints 1.5

        // double result3 = (double) (sum / digitCount);
        // System.out.println(result3); // prints 1.0


        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give speed:");
        // int atrums = Integer.valueOf(scanner.nextLine());
        // if (atrums > 120) {
        //     System.out.println("Speeding ticket!");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give the first number: ");
        // int cipars1 = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number: ");
        // int cipars2 = Integer.valueOf(scanner.nextLine());
        // if (cipars1 > cipars2) {
        //     System.out.println("Greater number is: " + cipars1);
        // } else if (cipars2 > cipars1) {
        //     System.out.println("Greater is number: " + cipars2);
        // } else {
        //     System.out.println("The numbers are equal!");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give points [0-100]:");
        // int points = Integer.valueOf(scanner.nextLine());
        // if (points < 0) {
        //     System.out.println("Grade: impossible!");
        // } else if (points >= 0 && points <= 49) {
        //     System.out.println("Grade: failed");
        // } else if (points >= 50 && points <= 59) {
        //     System.out.println("Grade: " + 1);
        // } else if (points >= 60 && points <= 69) {
        //     System.out.println("Grade: " + 2);
        // } else if (points >= 70 && points <= 79) {
        //     System.out.println("Grade: " + 3);
        // } else if (points >= 80 && points <= 89) {
        //     System.out.println("Grade: " + 4);
        // } else if (points >= 90 && points <= 100) {
        //     System.out.println("Grade: " + 5);
        // } else {
        //     System.out.println("Grade: incredible!");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Value of the gift?");
        // int gift = Integer.valueOf(scanner.nextLine());
        // if (gift >= 5000 && gift < 25000) {
        //     System.out.println("Tax: " + (100 + (gift-5000)*0.08));
        // } else if (gift >= 25000 && gift < 55000) {
        //     System.out.println("Tax: " + (1700 + (gift-25000)*0.1));
        // } else if (gift >= 55000 && gift < 200000) {
        //     System.out.println("Tax: " + ((4700 + (gift-55000)*0.12)));
        // } else if (gift >= 200000 && gift < 1000000) {
        //     System.out.println("Tax: " + ((22100 + (gift-200000)*0.15)));
        // } else if (gift >= 1000000) {
        //     System.out.println("Tax: " + ((142100 + (gift-1000000)*0.17)));
        // } else {
        //     System.out.println("No tax!");
        // }

        // Scanner scanner = new Scanner(System.in);

        // int numOfNum = 0;
        // int sum = 0;

        // while (true) {
        //     System.out.println("Give a number:");
        //     int number = Integer.valueOf(scanner.nextLine());

        //     if (number == 0) {
        //         break;
        //     }

        //     sum = sum + number;
        //     numOfNum = numOfNum + 1;
        // }

        // System.out.println("Number of numbers: " + numOfNum);
        // System.out.println("Sum of the numbers: " + sum);

        // Scanner scanner = new Scanner(System.in);

        // int start = Integer.valueOf(scanner.nextLine());

        // for (int i = start; i < 101; i++) {
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Last number? ");
        // int lastNum = Integer.valueOf(scanner.nextLine());
        // int sum = 0;

        // for (int i = 1; i <= lastNum; i++) {
        //     sum += i;
        // }

        // System.out.println("The sum is " + sum);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int numOfNum = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += number;
            numOfNum++;
        }
        
        double average = (double) sum / numOfNum;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNum);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
