package com.example.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AppService service;


    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Survey>listSurveys=service.listAll();
        model.addAttribute("listSurveys", listSurveys);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewSurveyPage(Model model){
        Survey survey=new Survey();
        model.addAttribute("survey",survey);
        return "new_survey";
    }

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public String saveProduct(@ModelAttribute("survey") Survey survey){
        service.save(survey);
        return "redirect:/";
    }



    @RequestMapping("edit/{id}")
    public ModelAndView showEditSurveyPage(@PathVariable(name="id")int id){
        ModelAndView mav=new ModelAndView("edit_survey");
        Survey survey=service.get(id);
        mav.addObject("student",survey);

        return mav;
    }


}
