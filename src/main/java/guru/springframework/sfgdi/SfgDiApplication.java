package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);

		I18Controller i18Controller = (I18Controller)ctx.getBean("i18Controller");
		System.out.println(i18Controller.sayHello());
		MyController myController = (MyController) ctx.getBean("myController");
		//beans name is the class name just the first letter small

		System.out.println("----Primary Bean");
		System.out.println(myController.sayHello());
		System.out.println("----Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		//there is no web server configured.
		System.out.println("----Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----Constructor");
		ConstructorInjectedController ConstructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(ConstructorInjectedController.getGreeting());
	}


}
