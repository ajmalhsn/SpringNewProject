package home.springframework.practice.SpringNewProject.controllers;

import home.springframework.practice.SpringNewProject.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContrcutorInjectedControllerTest {

    ContrcutorInjectedController contrcutorInjectedController;

    @BeforeEach
    void setUp() {
        contrcutorInjectedController = new ContrcutorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(contrcutorInjectedController.sayHello())
        ;
    }
}