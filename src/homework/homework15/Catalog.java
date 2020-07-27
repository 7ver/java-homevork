package homework.homework15;

import java.io.File;
import java.util.ArrayList;

public class Catalog {

    void getCatalog(File directory, String depth) {
        if(directory.isDirectory()) {
            for(File file : directory.listFiles()) {
                if(file.isDirectory()) {
                    System.out.println("");
                    System.out.println(depth + file.getName());
                    getCatalog(file, depth + "  ");
                } else {
                    System.out.println(depth + file.getName());
                }
            }
        } else {
            System.out.println(depth + directory.getName());
        }
    }
}
