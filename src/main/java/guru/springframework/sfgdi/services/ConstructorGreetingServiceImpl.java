package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting(){
        return "HelloWorld - Constructor";
    }
}
