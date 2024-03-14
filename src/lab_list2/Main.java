package lab_list2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static lab_list2.FileWriteRead.write;
import static lab_list2.FileWriteRead.read;

public class Main {
    public static void main(String[] args) {

        /*Worker[] workers = new Worker[4];
        workers[0] = new FullTimeWorker("Jan", "Kowalski", "Manager", 12345678901L, 5, Status.FULLTIME, 5000);
        workers[1] = new FullTimeWorker("Anna", "Nowak", "Secretary", 12345678902L, 3, Status.THREEFOURTHS, 3000);
        workers[2] = new HourlyWorker("Piotr", "Kowalczyk", "Driver", 12345678903L, 1, 160, 20);
        workers[3] = new HourlyWorker("Katarzyna", "Wójcik", "Cleaner", 12345678904L, 2, 120, 15);*/
        Scanner scanner = new Scanner(System.in);

        ArrayList<Worker> workers = new ArrayList<>();

        boolean inputWorkers = true;
        while(inputWorkers){
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter surname: ");
            String surname = scanner.nextLine();
            System.out.println("Enter position: ");
            String position = scanner.nextLine();
            System.out.println("Enter PESEL: ");
            long pesel = scanner.nextLong();
            System.out.println("Enter internship: ");
            int internship = scanner.nextInt();
            System.out.println("Enter type of worker (1 - FullTime, 2 - Hourly): ");
            int type = scanner.nextInt();
            if(type==1){
                System.out.println("Enter status (1 - FULLTIME, 2 - THREEFOURTHS, 3 - HALF, 4 - QUARTER): ");
                int status = scanner.nextInt();
                System.out.println("Enter base salary: ");
                double baseSalary = scanner.nextDouble();

                workers.add(new FullTimeWorker(name, surname, position, pesel, internship, Status.values()[status-1], baseSalary));
                break;
            }
            else if(type==2){
                System.out.println("Enter hours: ");
                int hours = scanner.nextInt();
                System.out.println("Enter base hour salary: ");
                double baseHourSalary = scanner.nextDouble();
                workers.add(new HourlyWorker(name, surname, position, pesel, internship, hours, baseHourSalary));
                break;
            }
            else{
                System.out.println("Wrong type of worker. Try again.");
            }
            scanner.nextLine();
            System.out.println("Do you want to add another worker? (yes/no)");
            String answer = scanner.nextLine();

            if(answer.equals("no")||answer.equals("No")||answer.equals("NO")){
                inputWorkers = false;
            }
        }

        Worker[] array = new Worker[workers.size()];
        array = workers.toArray(array);

        write(array);
        Worker[] readWorkers = read();
        Iterator<Worker> iterator =  new ArrayIterator(readWorkers);
        System.out.println("-------------------------------------------------------------------------------------------------\n" +
                           "|Name           |Surname        |Position       |PESEL          |Internship     |Salary         |\n" +
                           "-------------------------------------------------------------------------------------------------");
        while (iterator.hasNext()) {
            iterator.next().show();
        }


    }
}
