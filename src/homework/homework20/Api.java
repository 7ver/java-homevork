package homework.homework20;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;

public class Api {
    static final Logger log = LogManager.getLogger(Api.class);

    final String requestUrl = "https://api.thecatapi.com/v1/images/search?breed_id=beng&x-api-key=748b2685-f77f-4bc9-9cd8-00262dad5407";

    void getJsonCatlist() {
        try {
            log.info("Started requesting CatList.");
            URL jsonURL = new URL(requestUrl);
            ObjectMapper objectMapper = new ObjectMapper();
            Cat[] catList = objectMapper.readValue(jsonURL, new TypeReference<Cat[]>(){});

            log.debug("Request on url: {} succesfull.", jsonURL.toString());

            for(Cat cat : catList) {
                System.out.println(cat.getUrl());
                System.out.println(cat.getId());
                System.out.println(cat.getWidth());
            }
        } catch(Exception ex) {
            System.out.println(ex);
            log.error("Request on url: {} failed. Error: {}", requestUrl, ex);
        }
    }
}
