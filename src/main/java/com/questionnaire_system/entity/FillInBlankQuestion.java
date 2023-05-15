/*
package com.questionnaire_system.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName("fillin")
@JsonTypeName("2")
public class FillInBlankQuestion extends Question {
    private String answer; //用户的回答
    private String correctAnswer; //正确的答案

    public FillInBlankQuestion(int id, String title, String description) {
        super(id, title, description);
    }
    public FillInBlankQuestion(int id, String title, String description, String correctAnswer) {
        super(id, title, description);
        this.correctAnswer = correctAnswer;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
*/


package com.questionnaire_system.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName("fillin")
@JsonTypeName("2")
public class FillInBlankQuestion extends Question {
    private String answer; //用户的回答
    private String correctAnswer; //正确的答案

    public FillInBlankQuestion(int id, String title, String description) {
        super(id, title, description,2);
    }
    public FillInBlankQuestion(int id, String title, String description, String correctAnswer) {
        super(id, title, description,2);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString(){
        StringBuilder FillInBlankQuestionStr = new StringBuilder();
        FillInBlankQuestionStr.append(this.getId()).append(" ").append(this.getTitle()).append(" ")
                .append(this.getDescription()).append("\n");
        FillInBlankQuestionStr.append("正确答案：");
        FillInBlankQuestionStr.append(correctAnswer).append(" ");
        FillInBlankQuestionStr.append("所填内容：");
        FillInBlankQuestionStr.append(answer);
        FillInBlankQuestionStr.append("\n");
        return FillInBlankQuestionStr.toString();
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
