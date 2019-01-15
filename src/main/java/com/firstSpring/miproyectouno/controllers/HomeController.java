package com.firstSpring.miproyectouno.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "saludo";
    }

    @GetMapping("/homeconparametros")
    public ModelAndView homedos(){

        ModelAndView mav = new ModelAndView("home");
        mav.addObject("usuario","Rafa");

        return mav;
    }

}
