package edu.neumont.dbt230.controller;

import java.io.File;

public class SearchFiles {

    private static final File FILE_PATH = new File("C:/Year1-Neumont/Databases 2/AssignmentOneData/people/long");

    private static final int FILE_MAX = FILE_PATH.list().length;

    public static String searchingFiles(int id){
        for (int i = 0; i <= FILE_MAX ; i++) {
            if(i == id){
                return FILE_PATH.toString() + id +".txt";
            } else {
                i++;
            }
        }
        return null;
    }
}
