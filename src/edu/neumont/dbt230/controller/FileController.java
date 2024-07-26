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
            // Welcome the user
            Display.welcomeMsg();
            int selection = Display.mainMenu(); // UI method that takes in the user input
            switch(selection)
            {
                case 1:
                    // 1. Create an employee file
                        // get the first name
                        // get the last name
                        // get the hire year
                        // calls the formating file
                        // calls createFile

                    String fName = Display.getFirstName();
                    String lName = Display.getLastName();
                    int hireYear = Display.getHireYear();

                    FileManipulator.createFile(formatEmployeeContents(fName, lName, hireYear));

                    break;
                case 2:
                    // 2. Update an employee file
                        // get the id of the employee the user wants to update
                        // get the selection of what they want to update
                        // get the info they want to update
                        // calls updateFile

                    Display.getIDSearch();
                        int option = Display.updateMenu();
                        switch(option){
                            case 1:
                                // First Name
                                Display.updateFirstName();
                                break;
                            case 2:
                                // Last Name
                                Display.updateLastName();
                                break;
                            case 3:
                                // Hire Year
                                Display.updateHireYear();
                                break;
                        }

                    break;
                case 3:
                    // 3. Delete an employee file
                        // get the id of the employee the user wants to delete
                        // calls deleteFile

                    int idDelete = Display.getIDSearch();
                    FileManipulator.deleteFile(idDelete);

                    break;
                case 4:
                    // 4. Search for an employee
                        // get the id of the employee the user wants to find
                        // calls getSingleEmployee

                    int idSearch = Display.getIDSearch();
                    FileManipulator.deleteFile(idSearch);

                    break;
                case 5:
                    // 5. View all employees
                    Display.printEmployees();
                    break;
                default:
                    // 6. Quit
                    Display.quit();
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
