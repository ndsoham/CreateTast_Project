package com.example.createtask_project;

public class Question {
    private String questionText = "";
    private int value = 0;
    public Question(String qt, int value){
        questionText = qt;
        this.value = value;
    }
    public String getQuestionText(){
        return questionText;
    }
    public int getValue(){
        return value;
    }
    public void setQuestionText(String qt){
        questionText = qt;
    }
    public void setValue(int value){
        this.value = value;
    }

}
