package home.springframework.practice.SpringNewProject.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SpringPropertyInjectedControllerTest {

    @Autowired
    SpringPropertyInjectedController springPropertyInjectedController;

    @Test
    void sayGreeting() {
        System.out.println(springPropertyInjectedController.sayGreeting());
    }
}