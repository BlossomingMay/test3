package ynu.javatest3demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ynu.javatest3demo.dao.FilmDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@Service
public class FilmService {

    private String title;
    private String description;
    private int language_id;

    @Autowired
    FilmDao filmDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void SuccessInsert() throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/application.properties"));
        properties.load(reader);
        title=properties.getProperty("title");
        description=properties.getProperty("description");
        language_id=Integer.parseInt(properties.getProperty("language_id"));
        System.out.println("Film Title || "+title);
        System.out.println("Film Description || "+description);
        System.out.println("Film LanguageId || "+language_id);
        filmDao.insertFilm(title,description,language_id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void FailInert(){
        filmDao.insertFilm("123","123",1);
        throw new RuntimeException();
    }
}
