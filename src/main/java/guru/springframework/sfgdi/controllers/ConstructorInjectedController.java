package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


//Best practise
@Controller
public class ConstructorInjectedController {

    //Autowired a artık gerek yok
    private final GreetingService greetingService;

    //lowercase for the bean qualifer
    public ConstructorInjectedController( @Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
