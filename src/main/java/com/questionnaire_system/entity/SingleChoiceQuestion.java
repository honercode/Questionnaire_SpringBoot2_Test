/*
package com.questionnaire_system.entity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("0")
public class SingleChoiceQuestion extends Question {
    private List<String> options;
    private Integer answerIndex; //正确答案的索引
    private Integer selectedOptionIndex; //被选中的选项的索引

    //假如此单选题无正确选项可言，那么就把answerIndex设为-1
    public SingleChoiceQuestion(int id, String title, String description, List<String> options) {
        super(id, title, description);
        this.options = options;
        this.answerIndex = -1;
        this.selectedOptionIndex = -1;
    }
    public SingleChoiceQuestion(int id, String title, String description, List<String> options,int answerIndex) {
        super(id, title, description);
        this.options = options;
        this.answerIndex = answerIndex;
        this.selectedOptionIndex = -1;
    }

    @JsonCreator
    public SingleChoiceQuestion(int id, String title, String description, List<String> options,
                                Integer answerIndex, Integer selectedOptionIndex) {
        super(id, title, description);
        this.options = options;
        this.answerIndex = answerIndex;
        this.selectedOptionIndex = selectedOptionIndex;
    }


    //判断有没有选择对
    public boolean isCorrect() {
        if(selectedOptionIndex == -1){return false;}
        else {
            return selectedOptionIndex.equals(answerIndex);
        }
    }

    @Override
    public String toString(){
        StringBuilder SingleChoiceQuestionStr = new StringBuilder();
        SingleChoiceQuestionStr.append(this.getId()).append(" ").append(this.getTitle()).append(" ")
                .append(this.getDescription()).append("\n");
        for(String option : this.options){
            SingleChoiceQuestionStr.append(option).append(" ");
        }
        SingleChoiceQuestionStr.append("\n");
        return SingleChoiceQuestionStr.toString();
    }

    public List<String> getOptions() {
        return this.options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

    public int getSelectedOptionIndex() {
        return selectedOptionIndex;
    }

    public void setSelectedOptionIndex(int selectedOptionIndex) {
        this.selectedOptionIndex = selectedOptionIndex;
    }
}
*/



package com.questionnaire_system.entity;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("0")
public class SingleChoiceQuestion extends Question {
    private List<String> options;

    private Integer answerIndex; //正确答案的索引
    private Integer selectedOptionIndex; //被选中的选项的索引

    //假如此单选题无正确选项可言，那么就把answerIndex设为-1
    public SingleChoiceQuestion(int id, String title, String description, List<String> options) {
        super(id, title, description,0);
        this.options = options;
        this.answerIndex = -1;
        this.selectedOptionIndex = -1;
    }
    public SingleChoiceQuestion(int id, String title, String description, List<String> options,int answerIndex) {
        super(id, title, description,0);
        this.options = options;
        this.answerIndex = answerIndex;
        this.selectedOptionIndex = -1;
    }

    public SingleChoiceQuestion(int id, String title, String description, int questionType, List<String> options,
                                Integer answerIndex, Integer selectedOptionIndex) {
        super(id, title, description, questionType);
        this.options = options;
        this.answerIndex = answerIndex;
        this.selectedOptionIndex = selectedOptionIndex;
    }


    //判断有没有选择对
    public boolean isCorrect() {
        if(selectedOptionIndex == -1){return false;}
        else {
            return selectedOptionIndex.equals(answerIndex);
        }
    }

    @Override
    public String toString(){
        StringBuilder SingleChoiceQuestionStr = new StringBuilder();
        SingleChoiceQuestionStr.append(this.getId()).append(" ").append(this.getTitle()).append(" ")
                .append(this.getDescription()).append("\n");
        for(String option : this.options){
            SingleChoiceQuestionStr.append(option).append(" ");
        }
        SingleChoiceQuestionStr.append("正确选项序号：");
        SingleChoiceQuestionStr.append(answerIndex).append(" ");
        SingleChoiceQuestionStr.append("所选选项序号：");
        SingleChoiceQuestionStr.append(selectedOptionIndex);
        SingleChoiceQuestionStr.append("\n");
        return SingleChoiceQuestionStr.toString();
    }

    public List<String> getOptions() {
        return this.options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getAnswerIndex() {
        return answerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        this.answerIndex = answerIndex;
    }

    public int getSelectedOptionIndex() {
        return selectedOptionIndex;
    }

    public void setSelectedOptionIndex(int selectedOptionIndex) {
        this.selectedOptionIndex = selectedOptionIndex;
    }
}
