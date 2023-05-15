package com.questionnaire_system.web.controller;

import com.questionnaire_system.entity.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://172.21.229.71:8081")
@RestController
@RequestMapping(value = "/")
public class QuestionnaireController {
    private static Map<String, Question> questionsList = new HashMap<>();
    static {

    }

    @GetMapping(value = "/create")
    public ResponseEntity<Object> getQuestion(){
        return new ResponseEntity<>(questionsList.values(),HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<String> postData(@RequestBody Map<String, Object> data) {
        // 处理数据
        return new ResponseEntity<String>("Data received successfully", HttpStatus.OK);
    }
}
