/**
 * @author dsargent
 * @createdOn 7/9/2024 at 6:19 PM
 * @projectName SimplePersistence
 * @packageName edu.neumont.dbt230.controller;
 */
package edu.neumont.dbt230.controller;

import edu.neumont.dbt230.model.Employee;
import edu.neumont.dbt230.view.Display;

public class FileController {

    public void run() {
        do{
            FileManipulator.getEmployeeData(FileManipulator.getFiles());
            FileManipulator.createIndexes();
            Display.welcomeMsg();
            int selection = Display.mainMenu();
            switch(selection) {
                case 1: // 1. Create an employee file
                    String fName = Display.getFirstName();
                    String lName = Display.getLastName();
                    int hireYear = Display.getHireYear();
                    FileManipulator.createFile(formatEmployeeContents(fName, lName, hireYear));
                    break;
                case 2: // 2. Update an employee file
                    int id = Display.getIDSearch();
                    int option = Display.updateMenu();
                        switch(option) {
                            case 1: // First Name
                                String updatedFirstName = Display.updateFirstName();
                                FileManipulator.updateFile(id, option, updatedFirstName);
                                break;
                            case 2: // Last Name
                                String updatedLastName = Display.updateLastName();
                                FileManipulator.updateFile(id, option, updatedLastName);
                                break;
                            case 3: // Hire Year
                                int updatedHireYear = Display.updateHireYear();
                                FileManipulator.updateFile(id, option, String.valueOf(updatedHireYear));
                                break;
                        }
                    break;
                case 3: // 3. Delete an employee file
                    int idDelete = Display.getIDSearch();
                    FileManipulator.deleteFile(idDelete);
                    break;
                case 4: // 4. Search for an employee
                    int idSearch = Display.getIDSearch();
                    String employee = FileManipulator.searchForFile(idSearch);
                    if(employee != null){
                        Employee foundEmployee = FileManipulator.getSingleEmployee(employee);
                        Display.printSingleEmployee(foundEmployee);
                    } else{
                        Display.errorMsg();
                    }
                    break;
                case 5: // 5. View all employees
                    int choice = Display.displayMenu();
                    switch(choice){
                        case 1: //Display by ID
                            Display.printIdIndexEmployees();
                            break;
                        case 2: //Display by Last Name
                            Display.printLastNameIndexEmployees();
                            break;
                        case 3: //Display unsorted employees
                            Display.printEmployees();
                            break;
                    }
                    break;
                default: // 6. Quit
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
