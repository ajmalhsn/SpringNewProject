package home.springframework.practice.SpringNewProject.controllers;

import home.springframework.practice.SpringNewProject.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
