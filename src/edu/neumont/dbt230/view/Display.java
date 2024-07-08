/**
 * @author dsargent
 * @createdOn 6/26/2024 at 6:02 PM
 * @projectName SimplePersistence
 * @packageName edu.neumont.dbt230.view;
 */
package edu.neumont.dbt230.view;

import edu.neumont.dbt230.controller.ReadingFiles;
import edu.neumont.dbt230.model.Employee;

public class Display {
    //Print content of file
    //Print the structured employees

    public static void printEmployeeFiles(){
        System.out.println("Printing non-structured employees:");
        for(String file : ReadingFiles.getFiles()){
            System.out.println(file);
        }
        System.out.println("-----------------------------");
    }

    public static void printEmployees(){
        System.out.println("Printing structured employees:");
        for(Employee employee : ReadingFiles.getEmployeeData(ReadingFiles.getFiles())){
            System.out.println(employee.toString());
            System.out.println("------------------");
        }
    }
}
