package homework.homework18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

class StringCoding {
    static final Logger log = LogManager.getLogger(StringCoding.class);

    void getChangedCodeString(String path, String oldEncoding, String newEncoding) {
        log.info("{} file encoding change.", path);
        log.debug("Path: {}, oldEncoding: {}, newEncoding: {}", path, oldEncoding, newEncoding);

        String result = "";

        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(path), oldEncoding)) {
            char[] buffer = new char[8192];
            int size;

            while((size = isr.read(buffer)) > 0) {
                result += new String(buffer, 0, size);
            }

            log.debug("File data get successfuly");
        } catch(Exception ex) {
            log.error("File data geting failed. Error: {}", ex.toString());
            System.out.println(ex);
        }

        if(result.length() > 0) {
            try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), newEncoding)) {
                osw.write(result);
                log.debug("New encoding data written succesfully.");
            } catch(Exception ex) {
                log.error("New encoding data written failed. Error: {}", ex.toString());
                System.out.println(ex);
            }
        }
    }
}
