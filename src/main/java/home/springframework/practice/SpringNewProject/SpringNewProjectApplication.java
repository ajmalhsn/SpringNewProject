package home.springframework.practice.SpringNewProject;

import home.springframework.practice.SpringNewProject.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "")
@SpringBootApplication
public class SpringNewProjectApplication {



	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringNewProjectApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main Method");


	}

}
