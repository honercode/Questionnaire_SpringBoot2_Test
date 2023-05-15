package com.questionnaire_system.entity;

import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Questionnaire {
    private int id;
    private String title;
    private String description;

    @JSONField
    private List<Question> questionList;


    public Questionnaire(){}
    @JsonCreator
    public Questionnaire(int id, String title, String description,
                         @JsonProperty("questionList") List<Question> questionList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questionList = questionList;
    }

    /*public Questionnaire() {
        this.id = -1;
        this.title = "";
        this.description = "";
        this.questionList = new ArrayList<Question>();
    }*/

    public void addQuestion(Question question){

    }

    public void removeQuestion(Question question){

    }

    @Override
    public String toString(){
        //String questionsStr = new String();
        StringBuilder questionsStr = new StringBuilder();
        questionsStr.append(this.id).append("\n").append(this.title).append("\n").
                append(this.description).append("\n");
        for (Question question : this.questionList){
            questionsStr.append(question.toString()).append("\n");
        }
        //questionsStr = questionsStr+"\n\n";
        return questionsStr.toString();
    }


    //get/set函数的名字不能乱取
    public List<Question> getQuestionList(){
        return this.questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}


/**
 *  Questionnaire
 *     - 属性：
 *         - id: Integer
 *         - title: String
 *         - description: String
 *     - 方法：
 *         - addQuestion(Question question): void
 *         - removeQuestion(Question question): void
 *         - getQuestions(): List&lt;Question&gt;
 */
