package com.javatpoint.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  

@Controller 
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)  
    public String home() {  
        return "resources/ab.html";  
    }  
      
    @RequestMapping(value="/admin", method=RequestMethod.GET)  
    public String privateHome() {  
        return "resources/privatepage.html";  
    }  
    
    @RequestMapping(value="/ab", method=RequestMethod.GET)  
    public String privateab() {  
        return "resources/ab.html";  
    }  
}

