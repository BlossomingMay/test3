package ynu.javatest3demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ynu.javatest3demo.service.FilmService;

import java.io.IOException;


@RestController
public class ExamController {

    @Autowired
    FilmService filmService;

    @GetMapping("/insert")
    public void insert(){
        try {
            filmService.SuccessInsert();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
