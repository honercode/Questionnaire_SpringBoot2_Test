/*package com.questionnaire_system.entity;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

//@JsonTypeName("multi")
@JsonTypeName("1")
public class MultiChoiceQuestion extends Question {
    private List<String> options;
    //多选题的回答与答案使用数组来存储
    private List<Integer> selectedOptionsIndex;
    private List<Integer> answerOptionsIndex;
    public MultiChoiceQuestion(int id, String title, String description, List<String> options) {
        super(id, title, description);
        this.options = options;
    }

    public MultiChoiceQuestion(int id, String title, String description,
                               List<String> options,List<Integer> answerOptionsIndex) {
        super(id, title, description);
        this.options = options;
        this.answerOptionsIndex = answerOptionsIndex;
    }

    //完整的构造函数
    public MultiChoiceQuestion(int id, String title, String description, List<String> options,
                               List<Integer> selectedOptionsIndex, List<Integer> answerOptionsIndex) {
        super(id, title, description);
        this.options = options;
        this.selectedOptionsIndex = selectedOptionsIndex;
        this.answerOptionsIndex = answerOptionsIndex;
    }

    //判断选择是否正确的函数（还未实现）

    public List<String> getOptions() {
        return this.options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Integer> getSelectedOptionsIndex() {
        return selectedOptionsIndex;
    }

    public void setSelectedOptionsIndex(List<Integer> selectedOptionsIndex) {
        this.selectedOptionsIndex = selectedOptionsIndex;
    }

    public List<Integer> getAnswerOptionsIndex() {
        return answerOptionsIndex;
    }

    public void setAnswerOptionsIndex(List<Integer> answerOptionsIndex) {
        this.answerOptionsIndex = answerOptionsIndex;
    }
}*/


package com.questionnaire_system.entity;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

//@JsonTypeName("multi")
@JsonTypeName("1")
public class MultiChoiceQuestion extends Question {
    private List<String> options;
    //多选题的回答与答案使用数组来存储
    private List<Integer> selectedOptionsIndex;
    private List<Integer> answerOptionsIndex;
    public MultiChoiceQuestion(int id, String title, String description, List<String> options) {
        super(id, title, description,1);
        this.options = options;
    }

    public MultiChoiceQuestion(int id, String title, String description,
                               List<String> options,List<Integer> answerOptionsIndex) {
        super(id, title, description,1);
        this.options = options;
        this.answerOptionsIndex = answerOptionsIndex;
    }

    //判断选择是否正确的函数（还未实现）


    @Override
    public String toString(){
        StringBuilder MultiChoiceQuestionStr = new StringBuilder();
        MultiChoiceQuestionStr.append(this.getId()).append(" ").append(this.getTitle()).append(" ")
                .append(this.getDescription()).append("\n");
        for(String option : this.options){
            MultiChoiceQuestionStr.append(option).append(" ");
        }
        MultiChoiceQuestionStr.append("正确选项序号：");
        for(Integer answerOptionIndex : this.answerOptionsIndex){
            MultiChoiceQuestionStr.append(answerOptionIndex).append(" ");
        }
        MultiChoiceQuestionStr.append("所选选项序号：");
        for(Integer selectedOptionIndex : this.selectedOptionsIndex){
            MultiChoiceQuestionStr.append(selectedOptionIndex).append(" ");
        }
        MultiChoiceQuestionStr.append("\n");
        return MultiChoiceQuestionStr.toString();
    }
    

    public List<String> getOptions() {
        return this.options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Integer> getSelectedOptionsIndex() {
        return selectedOptionsIndex;
    }

    public void setSelectedOptionsIndex(List<Integer> selectedOptionsIndex) {
        this.selectedOptionsIndex = selectedOptionsIndex;
    }

    public List<Integer> getAnswerOptionsIndex() {
        return answerOptionsIndex;
    }

    public void setAnswerOptionsIndex(List<Integer> answerOptionsIndex) {
        this.answerOptionsIndex = answerOptionsIndex;
    }
}
