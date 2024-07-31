/**
 * @author dsargent
 * @createdOn 6/26/2024 at 6:02 PM
 * @projectName SimplePersistence
 * @packageName edu.neumont.dbt230.view;
 */
package edu.neumont.dbt230.view;

import edu.neumont.dbt230.controller.FileManipulator;
import edu.neumont.dbt230.model.Employee;

public class Display {
    static Console console = new Console();

    public static void welcomeMsg(){
        System.out.println("Welcome to the Employee Database!");
    }
    public static int mainMenu(){
        int option = console.getIntInput("1. Create Employee File \n2. Update Employee File \n3. Delete Employee File \n4. Search for an Employee File \n" +
                "5. View All Employees \n6. Exit");
        return option;
    }

    public static String getFirstName(){
        String firstName = console.getStringInput("Enter the Employee's first name: ");
        return firstName;
    }
    public static String getLastName(){
        String lastName = console.getStringInput("Enter the Employee's last name: ");
        return lastName;
    }
    public static int getHireYear(){
        int hireYear = console.getIntInput("Enter the Employee's hire year: ");
        return hireYear;
    }

    public static int getIDSearch(){
        int idSearch = console.getIntInput("Enter the id of the wanted Employee: ");
        return idSearch;
    }

    public static int updateMenu(){
        int option = console.getIntInput("Choose what you would like to update:\n 1. First Name\n 2. Last Name\n 3. Hire Year");
        return option;
    }
    public static String updateFirstName(){
        String firstName = console.getStringInput("Enter the Employee's updated first name: ");
        return firstName;
    }
    public static String updateLastName(){
        String lastName = console.getStringInput("Enter the Employee's updated last name: ");
        return lastName;
    }
    public static int updateHireYear(){
        int hireYear = console.getIntInput("Enter the Employee's updated hire year: ");
        return hireYear;
    }

    public static void quit(){
        System.out.println("Exiting Application.....");
    }

    public static void successfulMsg(){
        System.out.println("Success!");
    }
    public static void errorMsg(){
        System.out.println("That employee does not exist!");
    }
    public static int displayMenu(){
        Console.writeLn("How would you like to see the employees?");
        return Console.getIntInput("1. By ID" + "\n" + "2. By Last Name" + "\n" + "3. Unsorted", 1, 3);
    }

    public static void printSingleEmployee(Employee employee){
        System.out.println(employee.toString());
    }
    public static void printEmployees(){
        System.out.println("Printing structured employees:");
        for(Employee employee : FileManipulator.getEmployeeData(FileManipulator.getFiles())){
            System.out.println(employee.toString());
            System.out.println("------------------");
        }
    }
    public static void printIdIndexEmployees(){
        System.out.println("Printing employees by ID:");
        for(int i = 1; i < FileManipulator.idIndex.size(); i ++){
            System.out.println(FileManipulator.idIndex.get(i));
            System.out.println("------------------");
        }
    }
    public static void printLastNameIndexEmployees(){
        System.out.println("Printing employees by last name");
    }

}
