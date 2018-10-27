package com.example.codeblog.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Blog {

    @NotNull
    @Size(min=3,max=50)
    private String title;

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=2000)
    private String body;


    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getBody(){
        return body;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setBody(String body){
        this.body = body;
    }



}
