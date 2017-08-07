package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import app.domain.Greeter;
import app.patterns.abstractfactory.HousePartsFactory;

@Configuration
@ComponentScan("app")
public class App {

    @Autowired
    private HousePartsFactory housePartsFactory;

    public static void main(String[] args) {
              ApplicationContext context = 
          new AnnotationConfigApplicationContext(App.class);
          System.out.println(
              context.getBean(Greeter.class).getGreeting()
          );
        
    }
}
