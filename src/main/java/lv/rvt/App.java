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


        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        int atrums = Integer.valueOf(scanner.nextLine());
        if (atrums > 120) {
            System.out.println("Speeding ticket!");
        }
    }

}
