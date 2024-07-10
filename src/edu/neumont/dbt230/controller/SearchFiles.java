package edu.neumont.dbt230.controller;

import java.io.*;

public class SearchFiles {

    private static final File FILE_PATH = new File("C:/Year1-Neumont/Databases 2/AssignmentOneData/people/long");
    private static final int FILE_MAX = FILE_PATH.list().length;

    public static String searchFiles(int id){
        for (int i = 0; i <= FILE_MAX ; i++) {
            if(i == id){
                try {
                    BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH + "/" + id)));
                    while (bReader.ready()) {
                        return bReader.readLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
