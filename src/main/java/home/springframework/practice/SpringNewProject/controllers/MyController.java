package home.springframework.practice.SpringNewProject.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Hello world!!!");
    }

    public String sayHello(){
        System.out.println("In Controller");

        return "Hello Everyone!!!";
    }
}
