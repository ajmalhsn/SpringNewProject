package home.springframework.practice.SpringNewProject.controllers;

import home.springframework.practice.SpringNewProject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringPropertyInjectedController {

    @Autowired
    GreetingService greetingService;


    public String sayGreeting() {
        return greetingService.sayHello();
    }
}
