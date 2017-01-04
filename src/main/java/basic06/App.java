package basic06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:basic06/basic06-config.xml");
		
		MessageBean bean = (MessageBean)ctx.getBean("msgBean");
		bean.sayHello();
		
		//MessageBean bean2 = (MessageBean)ctx.getBean("msgBean");
		
		//System.out.println(bean == bean2);
	}
}





