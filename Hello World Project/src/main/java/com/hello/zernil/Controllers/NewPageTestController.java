package com.hello.zernil.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewPageTestController {
    @RequestMapping("/Test")
    @ResponseBody
    String test(){
        return "Test Page Successful";
    }
}
