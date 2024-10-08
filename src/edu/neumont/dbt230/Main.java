package edu.neumont.dbt230;

import edu.neumont.dbt230.controller.FileController;
import edu.neumont.dbt230.controller.FileManipulator;
import edu.neumont.dbt230.view.Display;

/**
 * @author dsargent
 * @createdOn 6/26/2024 at 11:46 AM
 * @projectName SimplePersistence
 * @packageName PACKAGE_NAME;
 */

public class Main {
    public static void main(String[] args) {
        new FileController().run();
    }
}
