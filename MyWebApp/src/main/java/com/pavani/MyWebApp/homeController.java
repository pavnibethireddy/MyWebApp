package com.pavani.MyWebApp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
    @RequestMapping("home")
    public ModelAndView home(Alien alien)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        return mv;
    }

    /*
    @RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myName)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",myName);
        mv.setViewName("home");
        return mv;
    } */

    /*
    @RequestMapping("home")
    public String home(@RequestParam("name") String myName, HttpSession session)
    {
        System.out.println("hi" + myName);
        session.setAttribute("name", myName);
        return "home";
    } */

    /* @RequestMapping("home")
    public String home(HttpServletRequest req)
    {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        System.out.println("hi" + name);
        session.setAttribute("name",name);
        return "home";


    } */

}
