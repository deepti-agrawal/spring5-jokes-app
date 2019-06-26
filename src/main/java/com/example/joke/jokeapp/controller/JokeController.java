package com.example.joke.jokeapp.controller;

import com.example.joke.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
