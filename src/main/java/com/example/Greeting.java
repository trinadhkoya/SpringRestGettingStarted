package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by trina on 9/26/2016.
 */
@Controller
public class Greeting {


    //you can't write  the data without mentioing @ResponseBody here.
    //You might see a possible error like Whitelabel Error Page


    @RequestMapping("/")
    private @ResponseBody String greeting(){
        return "Hello";
    }
}
