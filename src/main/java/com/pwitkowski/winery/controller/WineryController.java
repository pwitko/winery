package com.pwitkowski.winery.controller;

import com.pwitkowski.winery.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WineryController {

    @Autowired
    private Service service;

    @RequestMapping(value = "/author")
    public String author(){
      return "author";
    }

    @RequestMapping(value = "/recipeList")
    public String recipeList(){
        return "recipeList";
    }
}
