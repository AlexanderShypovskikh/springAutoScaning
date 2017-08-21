package autoScanningBeans;

import org.springframework.stereotype.Component;

@Component
public class HomePet {

	
	public void say() {
		System.out.println("Hello from  "+this.toString());
	}
}
