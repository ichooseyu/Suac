package org.ichooseyu.suac.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demo {

    @RequestMapping("/hello")
    public String  hello(){
        return "hello world ！";
    }

}
