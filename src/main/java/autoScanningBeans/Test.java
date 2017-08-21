package autoScanningBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext app = new ClassPathXmlApplicationContext("AppContext.xml");
	 Person p = (Person) app.getBean("person");
	 p.sayHello();
	 p.getPet().say();
	 p.getPet().say();
	 p.getPet().say();
		
	  

	}

}
