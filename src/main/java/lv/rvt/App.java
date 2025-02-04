package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App 
{
    // public static void main( String[] args )
    // {
        
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

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give numbers:");
        // int sum = 0;
        // int numOfNum = 0;
        // int even = 0;
        // int odd = 0;

        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());

        //     if (number == -1) {
        //         break;
        //     }

        //     if (number % 2 == 0) {
        //         even++;
        //     } else {
        //         odd++;
        //     }

        //     sum += number;
        //     numOfNum++;
        // }
        
        // double average = (double) sum / numOfNum;
        // System.out.println("Thx! Bye!");
        // System.out.println("Sum: " + sum);
        // System.out.println("Numbers: " + numOfNum);
        // System.out.println("Average: " + average);
        // System.out.println("Even: " + even);
        // System.out.println("Odd: " + odd);

    // }

    // public static void main( String[] args )
    // {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("How many times?");
    //     int times = Integer.valueOf(scanner.nextLine());
    //     for (int i = 0; i < times; i++) {
    //         printText();
    //     }
        
    // }

    // public static void printText() {
    //     System.out.println("In a hole in the ground there lived a method");
    // }

    // public static void main(String[] args) {
    //     divisibleByThreeInRange(2, 10);
    // }

    // public static void divisibleByThreeInRange(int x, int y) {
    //     for (int i = x; i <= y; i++) {
    //         if (i % 3 == 0) {
    //             System.out.println(i);
    //         }
    //     }
    // }
    
    // public static void main(String[] args) {
    //     printStars(5);
    //     printStars(3);
    //     printStars(9);
    //     System.out.println();
    //     printSquare(4);
    //     System.out.println();
    //     printRectangle(17, 3);
    //     System.out.println();
    //     printTriangle(4);
    // }

    // public static void printStars(int number) {
    //     for (int i = 0; i < number; i++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // public static void printSquare(int size) {
    //     for (int i = 0; i < size; i++) {
    //         printStars(4);
    //     }
    // }

    // public static void printRectangle(int width, int height) {
    //     for (int i = 0; i < height; i++) {
    //         printStars(width);
    //     }
    // }

    // public static void printTriangle(int size) {
    //     for (int i = 0; i < size; i++) {
    //         printStars(i+1);
    //     }
    // }


    // public static void main(String[] args) {
    //     christmasTree(10);
    // }

    // public static void printSpaces(int number) {
    //     for (int i = 0; i < number; i++) {
    //         System.out.print(" ");
    //     }
    // }

    // public static void printTriangle2(int size) {
    //     for (int i = 0; i < size; i++) {
    //         printSpaces(size-(i+1));
    //         printStars(i+1);
    //     }
    // }

    // public static void christmasTree(int height) {
    //     int stars = 1;
    //     for (int i = 0; i < height; i++) {
    //         printSpaces(height-(i+1));
    //         printStars(stars);
    //         stars += 2;
    //     }
    //     printSpaces(height-2);
    //     printStars(3);
    //     printSpaces(height-2);
    //     printStars(3);
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

        // ArrayList<String> nameList = new ArrayList<>();

        // while (true) {
        //     String name = scanner.nextLine();
            
        //     if (name == "") {
        //         break;
        //     }

        //     nameList.add(name);
        // }

        // System.out.println(nameList.get(2));


        // ArrayList<Integer> numList = new ArrayList<>();
        // int sum = 0;

        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());

        //     if (number == 0) {
        //         break;
        //     }
        //     sum += number;
        //     numList.add(number);
        // }
        // System.out.println(sum);

        // ArrayList<Integer> numList = new ArrayList<>();

        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());

        //     if (number == -1) {
        //         break;
        //     }

        //     numList.add(number);
        // }
        // System.out.print("From where? ");
        // int start = Integer.valueOf(scanner.nextLine());
        // while (start > numList.size()-1) {
        //     System.out.print("Out of Bound! From where? ");
        //     start = Integer.valueOf(scanner.nextLine());
        // }

        // System.out.print("To where? ");
        // int end = Integer.valueOf(scanner.nextLine());
        // while (end > numList.size()-1) {
        //     System.out.print("Out of Bound! To where? ");
        //     end = Integer.valueOf(scanner.nextLine());
        // }

        // for (int i = start; i <= end; i++) {
        //     System.out.println(numList.get(i));
        // }
    // }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // String longstName = "";
        // ArrayList<String> numList = new ArrayList<>();
        // int sum = 0;
        // while (true) {
        //     String nameAndAge = scanner.nextLine();

        //     if (nameAndAge.equals("")) {
        //         break;
        //     }

        //     String[] names = nameAndAge.split(",");
        //     numList.add(names[1]);
        //     sum += Integer.valueOf(names[1]);

        //     if (names[0].length() > longstName.length() ) {
        //         longstName = names[0];
        //     }
        // }
        // System.out.println("Longest name: " + longstName);
        // System.out.println("Average of the birth years: " + ((double) sum / numList.size()));

        // Account artosAccount = new Account("Matthews account", 1000.00);
        // Account artosSwissAccount = new Account("My account in Switzerland", 0.00);

        // System.out.println("Initial state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);

        // artosAccount.withdraw(100);
        // System.out.println("The balance of Matthews account is now: " + artosAccount.balance());
        // artosSwissAccount.deposit(100);
        // System.out.println("The balance of My account is now: " + artosSwissAccount.balance());

        // System.out.println("End state");
        // System.out.println(artosAccount);
        // System.out.println(artosSwissAccount);

        // Student matt = new Student();
        // matt.play();

        // Person ada = new Person("Ada");
        // Person antti = new Person("Antti");
        // Person martin = new Person("Martin");

        // ada.printPerson();
        // antti.printPerson();
        // martin.printPerson();

        // Product product1 = new Product("Banana", 1.1, 13);

        // product1.printProduct();

        // Person ada = new Person("Ada");
        // Person antti = new Person("Antti");

        // ada.printPerson();
        // antti.printPerson();
        // System.out.println("");

        // ada.growOlder();
        // ada.growOlder();

        // ada.printPerson();
        // antti.printPerson();
        
        // DecreasingCounter counter = new DecreasingCounter(100);

        // counter.printValue();

        // counter.reset();
        // counter.printValue();

        // counter.decrement();
        // counter.printValue();

        // Person pekka = new Person("Pekka");
        // Person antti = new Person("Antti");

        // pekka.growOlder();
        // pekka.growOlder();

        // antti.growOlder();

        // System.out.println("Pekka's age: " + pekka.returnAge());
        // System.out.println("Antti's age: " + antti.returnAge());
        // int combined = pekka.returnAge() + antti.returnAge();

        // System.out.println("Pekka's and Antti's combined age " + combined + " years");

        // Animal animal1 = new Animal("cat");
        // Animal animal2 = new Animal("dog");

        // System.out.println(animal1);
        // System.out.println(animal2);

        // Agent bond = new Agent("James", "Bond");

        // bond.toString();
        // System.out.println(bond);

        // Agent ionic = new Agent("Ionic", "Bond");
        // System.out.println(ionic);

        // Person pers1 = new Person("John");
        // pers1.setHeight(175);
        // pers1.setWeight(64);
        // System.out.println(pers1.getName() + " body mass index is " + pers1.bodyMassIndex());

        // Statistics sum = new Statistics();
        // Statistics sum_even = new Statistics();
        // Statistics sum_odd = new Statistics();

        // System.out.println("Enter numbers:");
        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == -1) {
        //         break;
        //     }
        //     if (number % 2 == 0) {
        //         sum_even.addNumber(number);
        //     }
        //     if (number % 2 != 0) {
        //         sum_odd.addNumber(number);
        //     }
        //     sum.addNumber(number);
        // }
        
        // System.out.println("Sum: " + sum.sum());
        // System.out.println("Sum of even numbers: " + sum_even.sum());
        // System.out.println("Sum of odd numbers: " + sum_odd.sum());

        // PaymentCard paulsCard = new PaymentCard(20);
        // PaymentCard mattsCard = new PaymentCard(30);

        // paulsCard.eatHeartily();
        // mattsCard.eatAffordably();
        // System.out.println(paulsCard);
        // System.out.println(mattsCard);

        // paulsCard.addMoney(20);
        // mattsCard.eatHeartily();
        // System.out.println(paulsCard);
        // System.out.println(mattsCard);
        
        // paulsCard.eatAffordably();
        // paulsCard.eatAffordably();
        // mattsCard.addMoney(50);
        // System.out.println(paulsCard);
        // System.out.println(mattsCard);

        // BufferedReader reader = Utils.getReader("persons.csv");
        // String line;

        // reader.readLine();
        // while ((line = reader.readLine()) != null) {
        //     String[] parts = line.split(", ");
        //     Person pers = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
        //     pers.printPerson();
        // }
        // reader.close();

        // Timer timer = new Timer();

        // while (true) {
        //     System.out.println(timer);
        //     timer.advance();

        //     try {
        //         Thread.sleep(10);
        //     } catch (Exception e) {

        //     }
        // }
        

        // Product tapeMeasure = new Product("Tape measure");
        // Product plaster = new Product("Plaster", "home improvement section");
        // Product tyre = new Product("Tyre", 5);

        // System.out.println(tapeMeasure);
        // System.out.println(plaster);
        // System.out.println(tyre);

        // Counter counter = new Counter(50);

        // counter.decrease(25);
        // counter.increase(100);
        // System.out.println(counter.Value());


        // Izlasīt persons.scv imantojot BufferReader  objektu

        // BufferedReader reader = Helper.gerReader("persons.csv");

        // int age_sum = 0;
        // int age_count = 0;
        // String line;
        // reader.readLine(); // Title row - Mēs ignorējam 1 rindu
        // while ((line = reader.readLine()) != null) {

        //     String[] parts = line.split(", ");
        //     age_sum += Integer.valueOf(parts[1]);
        //     age_count++;

        //     // Kā uzzināt personu vidējo vecumu no dotā csv faila
        // }

        // System.out.println("Vidējais personu vecums ir " + (double) age_sum/age_count + " gadi");

        // ArrayList<Person> persons = PersonManager.getPersonList();

        // for (Person person : persons) {
        //     System.out.println(person);
        // }


        // System.out.println("Hello. choose your command: ");
        // System.out.println("show - shows all persons");
        // System.out.println("add - add a person");
        // System.out.println("help - see avaivable commands");
        // System.out.println("exit");

        // while (true) {
        //     String command = scanner.nextLine();

        //     if (command.equals("show")) {
        //         ArrayList<Person> persons = PersonManager.getPersonList();

        //         for (Person person : persons) {
        //             System.out.println(person);
        //         }

        //     } else if (command.equals("add")) {
        //         System.out.println("Please enter name: ");
        //         String name = scanner.nextLine();
        //         System.out.println("Please enter age: ");
        //         int age = Integer.valueOf(scanner.nextLine());
        //         System.out.println("Please enter weight: ");
        //         Double weight = Double.valueOf(scanner.nextLine());
        //         System.out.println("Please enter height: ");
        //         Double height = Double.valueOf(scanner.nextLine());

        //         Person person = new Person(name, age, weight, height);

        //         PersonManager.addPerson(person);

        //     } else if (command.equals("help")) {
        //         System.out.println("Hello. choose your command: ");
        //         System.out.println("show - shows all persons");
        //         System.out.println("add - add a person");
        //         System.out.println("help - see avaivable commands");
        //         System.out.println("exit");

        //     } else if (command.equals("exit")) {
        //         break;
        //     }
        // }

        // System.out.println("Bye bye");

        // boolean isProgramRunning = true;
        // System.out.println("Welcome to person manager, type \"help\" to see avaible commands.");
        // while (isProgramRunning) {
        //     String command = scanner.nextLine();

        //     if (command.equals("exit")) {
        //         System.out.println("Thanks, bye bye!");
        //         isProgramRunning = false;
        //     } else if (command.equals("show")) {
        //         ArrayList<Person> persons = PersonManager.getPersonList();
        //         System.out.println("----------------------------------------------------");
        //         System.out.println("|  Name  | Age | Weight | Height | Body mass index |");
        //         System.out.println("----------------------------------------------------");
        //         for (Person person: persons) {
        //             System.out.printf("| %-7s| %-4d| %-7.1f| %-7.1f| %-16.2f|\n", person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.bodyMassIndex());
        //         }
        //         System.out.println("----------------------------------------------------");
        //     }
        //     System.out.println("Your command was: " + command);
        // }

        // HealthStation childrensHospital = new HealthStation();

        // Person ethan = new Person("Ethan", 1, 110, 7);
        // Person peter = new Person("Peter", 33, 176, 85);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(peter);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // System.out.println(unicafeExactum);

        // PaymentCard annesCard = new PaymentCard(2);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // unicafeExactum.addMoneyToCard(annesCard, 100);

        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // System.out.println(unicafeExactum);

        // SimpleDate date1 = new SimpleDate(1, 0, 0);
        // SimpleDate date2 = new SimpleDate(1, 0, 0);

        // Person person = new Person("Jack");

        // System.out.println(date1.equals(date2));

        // Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        // Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        // Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        // System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        // System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));

        // Box box = new Box(5, 7, 10);

        // Box biggerBox = box.biggerBox(box);
        // Box smallerBox = box.smallerBox(box);

        // System.out.println(biggerBox.width());
        // System.out.println(biggerBox.height());
        // System.out.println(biggerBox.length());
        // System.out.println();
        // System.out.println(smallerBox.width());
        // System.out.println(smallerBox.height());
        // System.out.println(smallerBox.length());
        // System.out.println();
        // System.out.println(box.width());
        // System.out.println(box.height());
        // System.out.println(box.length());

        // System.out.println(smallerBox.nests(box));

        // Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        // System.out.println(engine.getEngineType());
        // System.out.println(engine.getManufacturer());

    //     ArrayList<Person> persons = new ArrayList<Person>();
    //     persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    //     persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    //     printPersons(persons);

    // public static void printPersons(ArrayList<Person> persons) {
    //     for (Person person: persons) {
    //         System.out.println(person);
    //     }
    // }

    ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    juice.takeFromWarehouse(11.3);
    juice.addToWarehouse(1.0);

    juice.printAnalysis();
    
    }
}