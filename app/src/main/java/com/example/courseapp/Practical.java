package com.example.courseapp;

public class Practical {

    private String prac_name;
    private String prac_content;

    Practical(){
        super();
    }

    Practical(String prac_name, String prac_content){
        this.prac_name = prac_name;
        this.prac_content = prac_content;

    }
    public  String getPrac_Name(){
        return prac_name;
    }

    public void setPrac_name(String prac_name){
        this.prac_name = prac_name;
    }
    public  String getPrac_Content(){
        return  prac_content;
    }

    public void setPrac_Content(String prac_content){
        this.prac_content = prac_content;
    }
}
