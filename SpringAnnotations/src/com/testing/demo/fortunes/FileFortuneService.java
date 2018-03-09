package com.testing.demo.fortunes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;


@Component
public class FileFortuneService implements FortuneService {

    @Autowired
    private ApplicationContext context;


    // inject value from properties file
    @Value("${fortuneFilename}")
    private String FORTUNE_FILENAME;

    private String[] fortunes;

    // use to call this function at the end of the bean lifecycle
    @PostConstruct
    public void readFortunes() {

        String[] tempFortunes = {};

        /**
         * Can get it using ClassLoader
         *
         * class loader starts from root of the classpath (i.e. source)
         *
         * ClassLoader classLoader = getClass().getClassLoader();
         * InputStream inputStream = classLoader.getResourceAsStream(FORTUNE_FILENAME);
         */

        /** or use application context to get input stream */
        Resource resource = context.getResource("classpath:" + FORTUNE_FILENAME);


        try (BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
            ArrayList<String> fortuneList = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                fortuneList.add(line);
            }
            tempFortunes = fortuneList.toArray(new String[fortuneList.size()]);
        } catch (Exception e) {
            // bad stuff happened
        }
        this.fortunes = tempFortunes;
    }


    @Override
    public String getFortune() {
        if (this.fortunes.length == 0) return "";
        Random r = new Random();
        return this.fortunes[r.nextInt(this.fortunes.length)];
    }

}
