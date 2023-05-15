package com.questionnaire_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://172.21.229.71:8081")
public class QuestionnaireSpringBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(QuestionnaireSpringBoot2Application.class, args);

        //QuestionnaireFileController questionnaireFileController = new QuestionnaireFileController();
    }

}
