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
    public static final File FILE_PATH = new File("C:/Courses/Q4/DBT230/AssignmentOneData/people/simple");

    public static List<String> getFiles(){
        if(FILE_PATH.exists()){
            String[] employeeFiles = FILE_PATH.list();
            List<String> fileContent = new ArrayList<>();
            for(String employeeFile : employeeFiles){
                fileContent.add(readFile(employeeFile));
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

    public static void createFile(String contents) {
        int nextAvailableIndex = FILE_PATH.list().length + 1;
        writeFile(String.valueOf(nextAvailableIndex), nextAvailableIndex + ", " + contents);
    }
    public static void deleteFile(int id){
        File fileToDelete = new File(FILE_PATH + "/" + id + ".txt");
        for(int i = 0; i <= FILE_PATH.list().length; i++){
            if(fileToDelete.exists()){
                fileToDelete.delete();
            }
        }
    }
    public static void updateFile(int id, int userChoice, String updatedValue){
        String fileContent = searchForFile(id);
        String[] specificContent = fileContent.split(", ");
        switch(userChoice){
            case 1: //update first name
                specificContent[1] = updatedValue;
                break;
            case 2: //update last name
                specificContent[2] = updatedValue;
                break;
            case 3: //update hire year
                specificContent[3] = updatedValue;
                break;
        }
       String updatedFileContent = id + ", " + specificContent[1] + ", " + specificContent[2] + ", " + specificContent[3];
        writeFile(String.valueOf(id), updatedFileContent);
    }
    public static String searchForFile(int id){
        for (int i = 0; i <= FILE_PATH.list().length; i++) {
            if(i == id){
                return readFile(id + ".txt");
            }
        }
        return null;
    }

    private static String readFile(String id) {
        String fileInformation = "";
        try{
            BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH + "/" + id)));
            while(bReader.ready()){
                fileInformation = bReader.readLine();
            }
        } catch(IOException ioe){}
        return fileInformation;
    }
    private static void writeFile(String id, String contents){
        String path = FILE_PATH + "/" + id + ".txt";
        BufferedWriter bWriter = null;
        try{
            bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            try{
                bWriter.write(contents);
            } catch(IOException ioe){
                throw new RuntimeException(ioe);
            } finally{
                bWriter.close();
            }
        } catch(IOException ioe) {}

    public static void deleteFile(int id){
        for(int i = 0; i <= FILE_PATH.list().length;);
    }
}
