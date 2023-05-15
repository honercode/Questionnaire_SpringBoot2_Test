package com.questionnaire_system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.questionnaire_system.entity.*;
import com.questionnaire_system.file_controller.QuestionnaireFileController;
import com.questionnaire_system.web.controller.QuestionnaireController;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//@Test
public class Main {

    //@Test
    public static void main(String[] args) throws JsonProcessingException {

        QuestionnaireController questionnaireController = new QuestionnaireController();
        QuestionnaireFileController fileController = new QuestionnaireFileController(questionnaireController);

        Questionnaire questionnaire1 = fileController.parseQuestionnaireJSONFile
                ("storage/questionnaire_stringify4.json");

       /* System.out.println(questionnaire1.getId());
        System.out.println(questionnaire1.getTitle());
        System.out.println(questionnaire1.getDescription());
        System.out.println(questionnaire1.getQuestions().toString());*/
        System.out.println(questionnaire1);

        //fileController.stringifyQuestionnaireJSONFile(questionnaire1, "storage/questionnaire_stringify1.json");

        /*List<Question> questionList = new ArrayList<Question>();
        List<String> options = new ArrayList<String>();
        options.add("选项1");
        options.add("选项2");
        options.add("选项3");

        questionList.add(new SingleChoiceQuestion(0, "问题一", "问题一描述", options));
        questionList.add(new MultiChoiceQuestion(1, "问题二", "问题二描述", options));
        questionList.add(new FillInBlankQuestion(2, "问题三", "问题三描述"));

        Questionnaire questionnaire2 = new Questionnaire(2, "问卷二", "描述2", questionList);

        fileController.stringifyQuestionnaireJSONFile(questionnaire2,"storage/questionnaire_stringify4.json");*/
    }
}
