/*
package com.questionnaire_system.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

//@JsonIgnoreProperties(ignoreUnknown = true)
*/
/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "questionType")
@JsonSubTypes({
        *//*
*/
/*@JsonSubTypes.Type(value = SingleChoiceQuestion.class,name = "single"),
        @JsonSubTypes.Type(value = MultiChoiceQuestion.class,name = "multi"),
        @JsonSubTypes.Type(value = FillInBlankQuestion.class,name = "fillin")*//*
*/
/*
        @JsonSubTypes.Type(value = SingleChoiceQuestion.class,name = "0"),
        @JsonSubTypes.Type(value = MultiChoiceQuestion.class,name = "1"),
        @JsonSubTypes.Type(value = FillInBlankQuestion.class,name = "2")
})*//*


public class Question {
    private int id;
    private String title;
    private String description;


    //private enum QuestionType {SINGLE_CHOICE, MULTI_CHOICES, BLANK_FILL;}
    //private Integer questionType;

    @JsonCreator
    public Question(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Question() {
        this.id = -1;
        this.title = "";
        this.description = "";
    }

    @Override
    public String toString(){
        return this.id+" "+this.title+" "+this.description;
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
*/


/**
 * Question
 *     - 属性：
 *         - id: Integer
 *         - text: String
 *         - type: QuestionType
 *     - 方法：
 *         - getText(): String
 *         - getType(): QuestionType
 *
 */




package com.questionnaire_system.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/*@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "questionType")
@JsonSubTypes({
@JsonSubTypes.Type(value = SingleChoiceQuestion.class,name = "single"),
        @JsonSubTypes.Type(value = MultiChoiceQuestion.class,name = "multi"),
        @JsonSubTypes.Type(value = FillInBlankQuestion.class,name = "fillin")

        @JsonSubTypes.Type(value = SingleChoiceQuestion.class,name = "0"),
        @JsonSubTypes.Type(value = MultiChoiceQuestion.class,name = "1"),
        @JsonSubTypes.Type(value = FillInBlankQuestion.class,name = "2")
})*/
public class Question {
    private int id;
    private String title;
    private String description;


    //private enum QuestionType {SINGLE_CHOICE, MULTI_CHOICES, BLANK_FILL;}
    private int questionType;

    public Question(int id, String title, String description,int questionType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questionType = questionType;
    }

    public Question() {
        this.id = -1;
        this.title = "";
        this.description = "";
        this.questionType = -1;
    }

    @Override
    public String toString(){
        return this.id+" "+this.questionType+" "+this.title+" "+this.description;
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

    public int getQuestionType() {
        return questionType;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }


}

