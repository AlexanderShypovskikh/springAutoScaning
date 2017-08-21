package autoScanningBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="person")
public class Person implements Employee {
	private HomePet homePet; 
	
	public Person() {
		
	}

	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public HomePet getPet() {
		return new HomePet(); 
	}
	
	public void sayHello() {
		System.out.println("Hello from Person");
		for(int i = 0; i < 10; i++) {
			System.out.println("We called ---"+getPet());
		}
	}

}
