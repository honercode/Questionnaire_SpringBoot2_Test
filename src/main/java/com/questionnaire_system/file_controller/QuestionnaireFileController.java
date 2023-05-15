package com.questionnaire_system.file_controller;

import com.questionnaire_system.entity.*;
import com.questionnaire_system.entity.Questionnaire;
import com.questionnaire_system.web.controller.QuestionnaireController;
import com.alibaba.fastjson2.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireFileController {

    private QuestionnaireController questionnaireController;

    public QuestionnaireFileController(QuestionnaireController questionnaireController) {
        this.questionnaireController = questionnaireController;
    }


    public Questionnaire parseQuestionnaireJSONFile(String filePath){
        try {
            String jsonString = FileUtils.readFileToString(new File(filePath), "UTF-8");
            Questionnaire questionnaire = new Questionnaire();
            questionnaire.setId(JSON.parseObject(jsonString, Questionnaire.class).getId());
            questionnaire.setTitle(JSON.parseObject(jsonString, Questionnaire.class).getTitle());
            questionnaire.setDescription(JSON.parseObject(jsonString, Questionnaire.class).getDescription());

            JSONArray jsonQuestionList = JSON.parseObject(jsonString).getJSONArray("questionList");
            List<Question> questionList = new ArrayList<>();

            //——————这里进行类型转换！！！——————
            for(int i=0;i<jsonQuestionList.size();i++){
                if(jsonQuestionList.getJSONObject(i).getInteger("questionType") == 0){
                    questionList.add(JSON.parseObject
                            (jsonQuestionList.get(i).toString(),SingleChoiceQuestion.class));
                }
                if(jsonQuestionList.getJSONObject(i).getInteger("questionType") == 1){
                    questionList.add(JSON.parseObject
                            (jsonQuestionList.get(i).toString(),MultiChoiceQuestion.class));
                }
                if(jsonQuestionList.getJSONObject(i).getInteger("questionType") == 2){
                    questionList.add(JSON.parseObject
                            (jsonQuestionList.get(i).toString(),FillInBlankQuestion.class));
                }
            }

            questionnaire.setQuestionList(questionList);

            return questionnaire;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void stringifyQuestionnaireJSONFile(Questionnaire questionnaire,String filePath) {
        String jsonStr = JSON.toJSONString(questionnaire);
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonStr);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public QuestionnaireController getQuestionnaireController() {
        return questionnaireController;
    }

    public void setQuestionnaireController(QuestionnaireController questionnaireController) {
        this.questionnaireController = questionnaireController;
    }

}
