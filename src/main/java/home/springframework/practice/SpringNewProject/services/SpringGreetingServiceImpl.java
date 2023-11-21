package home.springframework.practice.SpringNewProject.services;

import org.springframework.stereotype.Service;

@Service
public class SpringGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello Everyone from Spring Service";
    }
}
