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

    // Welcome the user (void)
    public static void welcomeMsg(){
        System.out.println("Welcome to the Employee Database!");
    }

    // Console menu (returns an int)
    public static int mainMenu(){
        int option = console.getIntInput("1. Create Employee File \n2. Update Employee File \n3. Delete Employee File \n4. Search for an Employee File \n" +
                "5. View All Employees \n6. Exit");
        return option;
    }

    // Get first name of employee (returns a string)
    public static String getFirstName(){
        String firstName = console.getStringInput("Enter the Employee's first name: ");
        return firstName;
    }

    // Get last name of employee (returns a string)
    public static String getLastName(){
        String lastName = console.getStringInput("Enter the Employee's last name: ");
        return lastName;
    }

    // Get hire year of employee (returns an int)
    public static int getHireYear(){
        int hireYear = console.getIntInput("Enter the Employee's hire year: ");
        return hireYear;
    }

    // Get the id they want to search/update (returns an int)
    public static int getIDSearch(){
        int idSearch = console.getIntInput("Enter the id of the wanted Employee: ");
        return idSearch;
    }

    // menu for getting what the user would like to update (returns an int)
    public static int updateMenu(){
        int option = console.getIntInput("Choose what you would like to update:\n 1. First Name\n 2. Last Name\n 3. Hire Year");
        return option;
    }

    // Get what value the user wants to update (firstName, lastName, or hireYear) (returns an int)
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
        Console.getStringInput("Exiting Application..... Press any key to exit.");
    }

    // Successful message (void)
    public static void successfulMsg(){
        System.out.println("Success!");
    }

    // Error message (for when an employee doesn't exist) (void)



    // Print a single employee (void)

    //Print the structured employees
    public static void printEmployees(){
        System.out.println("Printing structured employees:");
        for(Employee employee : FileManipulator.getEmployeeData(FileManipulator.getFiles())){
            System.out.println(employee.toString());
            System.out.println("------------------");
        }
    }

}
