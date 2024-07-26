/**
 * @author dsargent
 * @createdOn 7/9/2024 at 6:19 PM
 * @projectName SimplePersistence
 * @packageName edu.neumont.dbt230.controller;
 */
package edu.neumont.dbt230.controller;

import edu.neumont.dbt230.view.Display;

public class FileController {
    public void run(){
        do{
            //Welcome the user
            int selection = -1; //UI method that takes in the user input
            switch(selection)
            {
                case 1: //1. Create an employee file
                    //get the first name
                    //get the last name
                    //get the hire year
                    //calls the formating file
                    //calls createFile
                    break;
                case 2: //2. Update an employee file
                    //get the id of the employee the user wants to update
                    //get the selection of what they want to update
                    //get the info they want to update
                    //calls updateFile
                    break;
                case 3: //3. Delete an employee file
                    //get the id of the employee the user wants to delete
                    //calls deleteFile
                    break;
                case 4: //4. Search for an employee
                    //get the id of the employee the user wants to find
                    //calls getSingleEmployee
                    break;
                case 5: //5. View all employees
                    Display.printEmployees();
                    break;
                default: //6. Quit
                    return;
            }
        } while(true);
    }

    private String formatEmployeeContents(String firstName, String lastName, int hireYear){
        StringBuilder contents = new StringBuilder();
        contents.append(firstName + ", ");
        contents.append(lastName + ", ");
        contents.append(hireYear);
        return contents.toString();
    }
}
