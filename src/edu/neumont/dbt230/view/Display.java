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
    //Print the structured employees
    public static void printEmployees(){
        System.out.println("Printing structured employees:");
        for(Employee employee : FileManipulator.getEmployeeData(FileManipulator.getFiles())){
            System.out.println(employee.toString());
            System.out.println("------------------");
        }
    }
    //Console menu (returns an int)
    //Get first name of employee (returns a string)
    //Get last name of employee (returns a string)
    //Get hire year of employee (returns an int)
    //Get the id they want to search/update (returns an int)
    //menu for getting what the user would like to update (returns an int)
    //Get what value the user wants to update (firstName, lastName, or hireYear) (returns an int)
    //Successful message (void)
    //Error message (for when an employee doesn't exist) (void)
    //Print a single employee (void)
    //Welcome the user (void)
}
