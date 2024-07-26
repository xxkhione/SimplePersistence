package edu.neumont.dbt230.controller;

import java.io.File;

public class CreateFile {

    private static final File FILE_PATH = new File("C:/Year1-Neumont/Databases 2/AssignmentOneData/people/long");
    private static final int FILE_MAX = FILE_PATH.list().length;

    public static void createFile(int id, String firstName, String lastName, int hireYear) {
        if(FILE_PATH.exists()){
            for (int i = 0; i < FILE_MAX; i++) {
                if(id == i + 1){

                } else{
                    break;
                }
            }
        }
    }
}
