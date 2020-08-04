package homework.homework15;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCreator {
    private File file;
    private final String DESTINATION = ".//src//homework//homework15//creator";
    private static final Logger log = LogManager.getLogger(FileCreator.class);

    public File getFile() {
        return file;
    }

    public boolean createFile(String name) {
        log.debug("Started creating file, with name: " + name);
        file = new File(DESTINATION, name);
        try {
            log.info("File " + name + " was created");

            return file.createNewFile();
        } catch(IOException ex) {
            log.error("File {} creation failed", name);
            log.debug("Error: {}", ex);

            return false;
        }
    }

    public boolean renameFile (String newName) {
        if (file == null) {
            log.debug("Renaming file to " + newName + " was failed. Reason: file doesnt exist.");
            System.out.println("You didn`t create a file");

            return false;
        }

        try {
            log.info("Renaming file " + file.getName() + " into " + newName + ". Success!");

            return file.renameTo(new File(DESTINATION, newName));
        } catch(Exception ex) {
            log.info("Renaming file " + file.getName() + " into " + newName + ". Failed!");
            log.debug("Renaming file failed. Error: " + ex);

            return false;
        }
    }

    public boolean copyFile(Path path) {
        if (file == null) {
            log.debug("Copying file to " + path.toString() + " was failed. Reason: file doesnt exist.");
            System.out.println("You didn`t create a file");

            return false;
        }

        try {
            log.info("Copying file " + file.getName() + " to " + path.toString() + ". Success!");
            Files.copy(file.toPath(), path, StandardCopyOption.REPLACE_EXISTING);

            return true;
        } catch(Exception ex) {
            log.info("Copying file " + file.getName() + " to " + path.toString() + ". Failed!");
            log.debug("Copying file failed. Error: " + ex);

            return false;
        }
    }

    public boolean deleteFile() {
        if (file == null) {
            log.debug("Delete file was failed. Reason: file doesnt exist.");
            System.out.println("You didn`t create a file");

            return false;
        }

        try {
            log.info("Deleting file " + file.getName() + ". Success!");

            return file.delete();
        } catch(Exception ex) {
            log.info("Deleting file " + file.getName() + ". Failed!");
            log.debug("Deleting file failed. Error: " + ex);

            return false;
        }
    }
}
