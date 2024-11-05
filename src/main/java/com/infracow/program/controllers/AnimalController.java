package com.infracow.program.controllers;

import com.infracow.program.models.Animal;
import com.infracow.program.services.AnimalService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService service;

    //Path of Images Folder
    String folderPath = "src/main/resources/images/analyses";

    @GetMapping("/animais")
    public ModelAndView getAnimais(){
        ModelAndView model = new ModelAndView("imagens");


        model.addObject("animais", service.getAnimaisWithImages());
        model.addObject("url", folderPath);
        return model;
    }

}