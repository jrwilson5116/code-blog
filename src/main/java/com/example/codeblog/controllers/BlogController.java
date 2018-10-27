package com.example.codeblog.controllers;

import com.example.codeblog.models.data.BlogDao;
import com.example.codeblog.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogDao blogDao;



    @RequestMapping(value = "")
    public String index(Blog blog){

        return "blog/index";
    }



}
