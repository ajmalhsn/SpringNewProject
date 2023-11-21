package home.springframework.practice.SpringNewProject.controllers;

import home.springframework.practice.SpringNewProject.services.GreetingService;

public class ContrcutorInjectedController {

    private final GreetingService greetingService;

    public ContrcutorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
