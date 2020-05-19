package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Application.properties de bir şey yoksa burdaki default çalışır.
@Profile({"ES", "default"})
@Service("i18nService")
public class I18SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Mundo - ES";
    }
}
