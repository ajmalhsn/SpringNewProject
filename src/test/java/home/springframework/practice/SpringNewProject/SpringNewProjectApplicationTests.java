package home.springframework.practice.SpringNewProject;

import home.springframework.practice.SpringNewProject.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringNewProjectApplicationTests {




	@Autowired
	ApplicationContext applicationContext;
	@Test
	void myTest() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println("In My Controller Test");
		System.out.println(controller.sayHello());
		assertEquals(controller.sayHello(),"Hello Everyone!!!");
		assertEquals(controller.sayHello(),"");
	}

	@Test
	void contextLoads() {
	}

}
