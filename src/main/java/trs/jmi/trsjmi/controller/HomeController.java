package trs.jmi.trsjmi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public String home(){
        return "home/members";
    }


    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String events(){
        return "TRSEvents/events";
    }


}
