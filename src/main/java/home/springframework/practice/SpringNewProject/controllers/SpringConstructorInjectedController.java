package home.springframework.practice.SpringNewProject.controllers;

import home.springframework.practice.SpringNewProject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConstructorInjectedController {


    private final GreetingService greetingService;

    public SpringConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
