/**
 * @author dsargent
 * @createdOn 6/26/2024 at 6:01 PM
 * @projectName SimplePersistence
 * @packageName edu.neumont.dbt230.controller;
 */
package edu.neumont.dbt230.controller;

import edu.neumont.dbt230.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManipulator {
    private static final File FILE_PATH = new File("C:/Courses/Q4/DBT230/AssignmentOneData/people/long");

    public static List<String> getFiles(){
        if(FILE_PATH.exists()){
            String[] employeeFiles = FILE_PATH.list();
            List<String> fileContent = new ArrayList<>();
            for(String employeeFile : employeeFiles){
                try{
                    BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH + "/" + employeeFile)));
                    while(bReader.ready()){
                        fileContent.add(bReader.readLine());
                    }
                } catch(IOException ioe){}
            }
            return fileContent;
        }
        return null;
    }

    public static List<Employee> getEmployeeData(List<String> employeeInfo){
        List<Employee> employees = new ArrayList<>();
        for(String info : employeeInfo){
            Employee employee = null;
            int id = 0;
            String firstName = null;
            String lastName = null;
            int hireYear = 0;

            String[] infoParts = info.split(", ");
            id = Integer.parseInt(infoParts[0]);
            firstName = infoParts[1];
            lastName = infoParts[2];
            hireYear = Integer.parseInt(infoParts[3]);
            employee = new Employee(id, firstName, lastName, hireYear);
            employees.add(employee);
        }
        return employees;
    }

    public static String searchingFiles(int id){
        for (int i = 0; i <= FILE_PATH.list().length; i++) {
            if(i == id){
                return FILE_PATH.toString() + id +".txt";
            }
        }
        return null;
    }

    public static void deleteFile(int id){
        File fileToDelete = new File(FILE_PATH + "/" + id);
        for(int i = 0; i <= FILE_PATH.list().length; i++){
            if(fileToDelete.exists()){
                fileToDelete.delete();
            }
        }
    }

    public static void updateFile(){
        int updateChoice = 1;
        switch(updateChoice){
            case 1: //update first name
                break;
            case 2: //update last name
                break;
            case 3: //update hire year
                break;
        }
    }
}
